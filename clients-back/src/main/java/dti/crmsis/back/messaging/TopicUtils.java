package dti.crmsis.back.messaging;

public class TopicUtils {

    public static final String DEAL_RECEIVED_API = "deal.received.api";
    public static final String DEAL_RECEIVED_API_RETRY_PREFIX = "deal.received.api.retry";
    public static final String DEAL_ASSIGNMENT_PROPOSED = "deal.assignment.proposed";
    public static final String DEAL_CLAIMED_PREFIX = "deal.claimed";

    public static String retryTopic(String flowId) {
        return DEAL_RECEIVED_API_RETRY_PREFIX + "_" + flowId;
    }

    public static String getDealClaimedTopic(String flowId) {
        return DEAL_CLAIMED_PREFIX + "_" + flowId;
    }

}
