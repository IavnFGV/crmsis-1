package dti.crmsis.back.taskassignment;

import java.util.Map;

public record LeadPayload(String id, Map<String, Object> data) {}