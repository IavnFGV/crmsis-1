package dti.crmsis.back.taskassignment;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class TaskAssignmentContext {
    Map<String, Object> data = new ConcurrentHashMap<>();

    ReentrantLock lock = new ReentrantLock();

    public ReentrantLock getLock() {
        return lock;
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }

    public String getFlowId() {
        return (String) data.get("flowId");
    }


}
