package dti.crmsis.back.taskassignment;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TaskAssignmentContext {
    Map<String, Object> data = new ConcurrentHashMap<>();

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }

    public String getFlowId() {
        return (String) data.get("flowId");
    }

    public synchronized void subscribeToSuccess(String flowId, Runnable onSuccess) {

    }

}
