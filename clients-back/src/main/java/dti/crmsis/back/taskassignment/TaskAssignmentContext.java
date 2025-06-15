package dti.crmsis.back.taskassignment;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class TaskAssignmentContext {
    Map<String, Object> data = new ConcurrentHashMap<>();

    int retry = 0;

    boolean completed = false;

    public void incrementRetry() {
        retry++;
    }

    public int getRetry() {
        return retry;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


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
