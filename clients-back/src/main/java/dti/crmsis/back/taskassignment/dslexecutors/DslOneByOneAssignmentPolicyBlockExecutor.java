package dti.crmsis.back.taskassignment.dslexecutors;

import dti.crmsis.back.dao.app.WorkDayEntity;
import dti.crmsis.back.dao.pd.UserEntity;
import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.availability.AvailabilityResult;
import dti.crmsis.back.taskassignment.availability.UserAvailabilityService;
import dti.crmsis.back.taskassignment.availability.WorkDayDto;
import dti.crmsis.back.taskassignment.availability.WorkDayParseService;
import dti.crmsis.back.taskassignment.dsl.DslOneByOneAssignmentPolicyBlock;
import dti.crmsis.back.taskassignment.dsl.MemberConfig;
import dti.crmsis.back.taskassignment.dsl.WaitRuleDto;
import dti.crmsis.back.taskassignment.framework.CantFindUserByEmailException;
import dti.crmsis.back.taskassignment.framework.TaskAssignmentApi;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;
import org.jboss.logging.MDC;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Unremovable
@Dependent
@BlockType("oneByOneAssignmentPolicy")
public class DslOneByOneAssignmentPolicyBlockExecutor
        extends DslAbstractAssignmentPolicyBlockExecutor<DslOneByOneAssignmentPolicyBlock> {
    private static final Logger LOG = Logger.getLogger(DslOneByOneAssignmentPolicyBlockExecutor.class);

    @Inject
    TaskAssignmentApi taskAssignmentApi;

    @Inject
    UserAvailabilityService userAvailabilityService;
    @Inject
    WorkDayParseService workDayParseService;


    private DslOneByOneAssignmentPolicyBlock block;
    private final AtomicInteger currentIndex = new AtomicInteger(0);
    private final List<String> memberEmails = new ArrayList<>();


    @Override
    public void init(DslOneByOneAssignmentPolicyBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        this.memberEmails.clear();
        this.memberEmails.addAll(block.getMembers().keySet());
    }

    @WithContextLock
    @Override
    public void receive(TaskAssignmentContext context) throws ContextIsCompletedException {
        String flowId = context.getFlowId();
        String selected;
        do {
            synchronized (this) {
                int index = currentIndex.getAndUpdate(i -> (i + 1) % memberEmails.size());
                selected = memberEmails.get(index);
            }
            try {
                LOG.infof("MDC before assign: %s", MDC.getMap());
                if (!assign(flowId, selected, context)) {
                    continue;
                }
                break;
            } catch (ContextIsCompletedException e) {
                throw e;
            } catch (Exception e) {
                LOG.infof("MDC on exception : %s", MDC.getMap());
                LOG.error(e.getMessage(), e);
                LOG.info("Assignment failed. Lets retry");
            }
        } while (true);
        scheduleRetry(context, determineWaitMinutes());
    }

    private long determineWaitMinutes() {
        java.time.LocalTime now = java.time.LocalDateTime.now(java.time.ZoneOffset.UTC).toLocalTime();
        java.util.List<WaitRuleDto> rules = block.getWaitRules();
        if (rules != null) {
            for (WaitRuleDto r : rules) {
                java.time.LocalTime from = java.time.LocalTime.parse(r.from);
                java.time.LocalTime to = java.time.LocalTime.parse(r.to);
                if (!now.isBefore(from) && now.isBefore(to)) {
                    return r.minutes;
                }
            }
        }
        return block.getWaitMinutes();
    }

    @WithContextLock
    protected boolean assign(String flowId, String selected, TaskAssignmentContext context) throws ContextIsCompletedException {
        LOG.info("Assigning " + selected + " to " + flowId);
        LOG.infof("MDC before findActiveByEmail: %s", MDC.getMap());
        Long userPipedriveId = UserEntity.findActiveByEmail(selected);
        if (userPipedriveId == null) {
            throw new CantFindUserByEmailException(selected);
        }

        MemberConfig memberConfig = block.getMembers().get(selected);

        List<String> workDays = Arrays.stream(memberConfig.getAvailability().split(",")).map(String::strip).toList();
        List<WorkDayEntity> entities = WorkDayEntity.find("name IN ?1", workDays).list();

        List<WorkDayDto> list = workDays.stream().map(
                        workDayName -> entities.stream().filter(workDayEntity -> workDayEntity.name.equals(workDayName)).findAny().orElse(null))
                .filter(Objects::nonNull)
                .map(workDayParseService::parse)
                .toList();

        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        LOG.infof("MDC before availability check: %s", MDC.getMap());
        AvailabilityResult availabilityResult = userAvailabilityService.checkAvailability(list, now);

        if (availabilityResult.available) {
            try {
                taskAssignmentApi.assign(Long.valueOf(flowId), userPipedriveId);
            } catch (Exception e) {
                LOG.error(e.getMessage(), e);
                LOG.info("Assignment failed. Lets retry");
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public Logger getLOG() {
        return LOG;
    }
}
