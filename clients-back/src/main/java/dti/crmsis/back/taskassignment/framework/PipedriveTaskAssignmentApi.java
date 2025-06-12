package dti.crmsis.back.taskassignment.framework;

import dti.crmsis.back.dao.pd.UserEntity;
import dti.crmsis.back.services.PipedriveService;
import dti.crmsis.back.taskassignment.TaskAssignmentsManager;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class PipedriveTaskAssignmentApi implements TaskAssignmentApi {
    private static final Logger LOG = Logger.getLogger(TaskAssignmentsManager.class);

    @Inject
    PipedriveService pipedriveService;

    @Override
    public void assign(Long dealId, String userMail) {
        Long userPipedriveId = UserEntity.findActiveByEmail(userMail);
        if (userPipedriveId == null) {
            throw new CantFindUserByEmailException(userMail);
        }
        try {
            pipedriveService.assignManager(dealId, userPipedriveId);
        } catch (Exception e) {
            LOG.errorf("CANT assign manager to deal [mail, idPipedrive, dealId] : [%s,%d%s]", userMail, userPipedriveId);
            LOG.error(e.getMessage(), e);
            throw new ProblemWithPipedriveException("CANT assign manager to deal");
        }
    }
}
