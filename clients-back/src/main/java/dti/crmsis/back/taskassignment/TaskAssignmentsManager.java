package dti.crmsis.back.taskassignment;

import dti.crmsis.back.dao.app.DslFlowConfigEntity;
import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import dti.crmsis.back.taskassignment.dsl.DslFlowBlock;
import dti.crmsis.back.taskassignment.dsl.DslParser;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.impl.ConcurrentHashSet;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

@ApplicationScoped
public class TaskAssignmentsManager {
    private static final Logger LOG = Logger.getLogger(TaskAssignmentsManager.class);


    @Inject
    EventBus eventBus;
    @Inject
    FlowsManager flowsManager;
    @Inject
    DslEngineFactory engineFactory;
    @Inject
    DslParser dslParser;

    Map<String, TaskAssignmentContext> contexts = new ConcurrentHashMap<>();
    Map<String, DslEngine> dslEngines = new ConcurrentHashMap<>();
    Set<Long> dealIdsForWhichDealReceivedMessageGot = new ConcurrentHashSet<>();

    public TaskAssignmentContext getOrCreateContext(String flowId) {
        return contexts.computeIfAbsent(flowId, id -> {
            TaskAssignmentContext taskAssignmentContext = new TaskAssignmentContext();
            taskAssignmentContext.put("flowId", flowId);
            taskAssignmentContext.put("retry", "0");
            return taskAssignmentContext;
        });
    }

    public TaskAssignmentContext getContext(String flowId) {
        return contexts.get(flowId);
    }

    public  void init() {
        eventBus.consumer(TopicUtils.DEAL_RECEIVED_API, this::dealReceivedApi);
    }

    private void dealReceivedApi(Message<WebhookRequestService.JsonProxy> message) {
        Long entityIdPipedrive = message.body().entityIdPipedrive;
        assert message.body().type.equals("deal") : "type must be deal: " + message.body().type;
        if (!dealIdsForWhichDealReceivedMessageGot.add(entityIdPipedrive)) {
            throw new AssertionError("deal.received.api can be called only once for any deal: " + entityIdPipedrive);
        }
        DslFlowConfigEntity flowDefinition = flowsManager.determineFlow(message.body());
        DslFlowBlock dslFlow = dslParser.parseFlow(flowDefinition.definition);
        String flowId = constructFlowId(entityIdPipedrive, flowDefinition);
        TaskAssignmentContext context = getOrCreateContext(flowId);
        context.put("entityId", String.valueOf(entityIdPipedrive));
        context.put("jsonProxy", message.body());
        DslEngine engine = engineFactory.createEngine(dslFlow, flowId);
        dslEngines.put(flowId, engine);
        subscribeToSuccessTopic(flowId);
        engine.execute(dslFlow.getInitialBlock(), context);
    }

    private void subscribeToSuccessTopic(String flowId) {
        AtomicReference<MessageConsumer<Object>> ref = new AtomicReference<>();

        ref.set(eventBus.consumer(TopicUtils.getDealClaimedTopic(flowId), message -> {
            String flowIdFromEvent = message.body().toString();
            TaskAssignmentContext context = getContext(flowIdFromEvent);
            DslEngine engine = dslEngines.get(flowIdFromEvent);
            engine.stop();
            context.put("success_flag", "true");

            dslEngines.remove(flowIdFromEvent);
            contexts.remove(flowIdFromEvent);

            MessageConsumer<Object> selfRef = ref.get();
            selfRef.unregister(ar -> {
                if (ar.succeeded()) {
                    LOG.info("Unsubscribed from topic: " + selfRef.address());
                } else {
                    LOG.error("Failed to unsubscribe: " + ar.cause().getMessage());
                }
            });
        }));
    }



    private String constructFlowId(Long entityIdPipedrive, DslFlowConfigEntity flowDefinition) {
        return entityIdPipedrive + "";
    }


}
