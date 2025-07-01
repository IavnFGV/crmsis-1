package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslUserFilterBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class TaskAssignmentContext {
    Map<String, Object> data = new ConcurrentHashMap<>();

    int retry = 0;

    boolean completed = false;
    private DslEngine engine;
    private String productName;

    private final List<String> prevAssignedUsers = new ArrayList<>();

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

    public void setEngine(DslEngine engine) {
        this.engine = engine;
    }

    public DslEngine getEngine() {
        return engine;
    }

    public String getProductName() {
        return this.productName;
    }

    public List<String> getPrevAssignedUsers() {
        return prevAssignedUsers;
    }

    public void addAssignedUser(String managerEmail) {
        this.prevAssignedUsers.add(managerEmail);
    }
}
