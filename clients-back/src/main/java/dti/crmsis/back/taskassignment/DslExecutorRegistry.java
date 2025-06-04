package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslBlock;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class DslExecutorRegistry {
    private final Map<String, DslBlockExecutor> executors = new ConcurrentHashMap<>();

    public <T extends DslBlock> DslBlockExecutor<T> get(String name) {
        return (DslBlockExecutor<T>) executors.get(name);
    }

    public void register(String name, DslBlockExecutor executor) {
        executors.put(name, executor);
    }

}
