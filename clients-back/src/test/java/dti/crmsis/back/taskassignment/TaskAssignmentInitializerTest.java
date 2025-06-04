package dti.crmsis.back.taskassignment;

import com.fasterxml.jackson.core.JsonProcessingException;
import dti.crmsis.back.NoDbTestProfile;
import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.dsl.DslFlowBlock;
import dti.crmsis.back.taskassignment.dsl.DslParser;
import dti.crmsis.back.taskassignment.dsl.DslOneByOneAssignmentPolicyBlock;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
//@TestProfile(NoDbTestProfile.class)
class TaskAssignmentInitializerTest {

    @Inject
    DslExecutorRegistry dslExecutorRegistry;
    @Inject
    DslBlockExecutorFactory factory;
    @Inject
    DslParser dslParser;
    @Test
    void testAssignmentPolicyParsing() {
        String json = """
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

        Map<String, DslBlock> parsed = dslParser.parseString(json);
        assertEquals(1, parsed.size());
        assertTrue(parsed.containsKey("assignmentPolicy1"));

        DslBlock block = parsed.get("assignmentPolicy1");
        assertTrue(block instanceof DslOneByOneAssignmentPolicyBlock);

        DslOneByOneAssignmentPolicyBlock policy = (DslOneByOneAssignmentPolicyBlock) block;
        assertEquals(3, policy.getMembers().size());
        assertEquals(4, policy.getRetryCount());
        assertEquals(15, policy.getWaitMinutes());
    }

    @Test
    public void registryShouldBeInitialized(){
        DslBlockExecutor<DslBlock> assignmentPolicy1 = dslExecutorRegistry.get("assignmentPolicy1");
        assertNotNull(assignmentPolicy1);
    }


    @Test
    void shouldParseFlow() throws JsonProcessingException {
        String json = """
                 {
                       "flow1": {
                         "version": 1,
                         "type": "flow",
                         "initialBlock": "srcWebhook",
                         "successOnTopic": "deal.claimed",
                         "blocks": {
                           "srcWebhook": {
                             "type": "source",
                             "subscribe": [
                               "deal.received.api",
                               "deal.received.api.retry"
                             ],
                             "pass_to": "assignment"
                           },
                           "assignment": {
                             "type": "refAssignmentPolicy",
                             "ref": "assignmentPolicy1"
                           }
                         }
                       }
                     }
                """;

        Map<String, DslBlock> parsed = dslParser.parseString(json);
        assertEquals(1, parsed.size());
        assertTrue(parsed.containsKey("flow1"));

        DslBlock block = parsed.get("flow1");
        assertTrue(block instanceof DslFlowBlock);

        DslFlowBlock dslFlowBlock = (DslFlowBlock) block;
        assertEquals("deal.claimed", dslFlowBlock.getSuccessOnTopic());

    }



}
