package dti.crmsis.back.taskassignment;

import com.fasterxml.jackson.core.JsonProcessingException;
import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.dsl.DslParser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Map;

@ApplicationScoped
public class TaskAssignmentInitializer {

    @Inject
    DslParser dslParser;

    @Inject
    DslExecutorRegistry dslExecutorRegistry;

    @Inject
    DslBlockExecutorFactory dslBlockExecutorFactory;

    public void init() {
        initGlobalBeans();
//        initGlobalActions();
    }

    private void initGlobalBeans() {
        String assignmentPolicy = """
                {
                      "assignmentPolicy1": {
                        "type": "oneByOneAssignmentPolicy",
                        "retryCount": "4",
                        "waitMinutes": 15,
                        "failAction": {
                          "type": "refAction",
                          "ref": "notifyTelegramAction1"
                        },
                        "members": {
                          "zabolotniy.evgeniy@gmail.com": {
                            "availability": "default"
                          },
                          "mufik.petro@gmail.com": {
                            "availability": "default"
                          },
                          "ivan.drozda@gmail.com": {
                            "availability": "default"
                          }
                        }
                      }
                    }
                
                """;

        String action = """
                {
                      "notifyTelegramAction1": {
                        "type": "notifyTelegramAction",
                        "token": "8102241829:AAEy_ZbU0aZhHZ-YLy5Yt9i6CLHkSNDY21g"
                      }
                    }
                """;
        Map<String, DslBlock> assignmentPolicyMap = dslParser.parseString(assignmentPolicy);
        for (var entry : assignmentPolicyMap.entrySet()) {
            dslExecutorRegistry.register(entry.getKey(), createBlock(entry.getValue()));
        }

        Map<String, DslBlock> actionMap = dslParser.parseString(action);
        for (var entry : actionMap.entrySet()) {
            dslExecutorRegistry.register(entry.getKey(), createBlock(entry.getValue()));
        }
    }

    private DslBlockExecutor<DslBlock> createBlock(DslBlock value) {
        DslBlockExecutor<DslBlock> executor = dslBlockExecutorFactory.createBlockExecutorFor(value);
        executor.init(value, null, null);
        return executor;
    }

}
