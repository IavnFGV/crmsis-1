package dti.crmsis.back;

import org.eclipse.microprofile.context.ManagedExecutor;
import org.jboss.logging.Logger;
import org.slf4j.MDC;

import java.util.Map;
import java.util.concurrent.CompletionStage;

public class MdcExecutorWrapper {
    private static final Logger LOG = Logger.getLogger(MdcExecutorWrapper.class);

    private final ManagedExecutor executor;
    private final String poolName;

    public MdcExecutorWrapper(ManagedExecutor executor, String poolName) {
        this.executor = executor;
        this.poolName = poolName;
    }

    public CompletionStage<Void> runAsync(String taskName, Runnable task) {
        return executor.runAsync(() -> {
            long start = System.currentTimeMillis();
            boolean wasException = false;
            MDC.put("pool", poolName);
            MDC.put("taskName", taskName);
            Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
            LOG.infof("Start task at [%d] [%s] (pool=%s)", start, taskName, poolName);
            try {
                task.run();
            } catch (Exception ex) {
                wasException = true;
                LOG.errorf(ex, "Task [%s] failed (pool=%s) with exception %s", taskName, poolName, ex.getMessage());
            } finally {
                MDC.setContextMap(copyOfContextMap);
                long end = System.currentTimeMillis();
                LOG.infof("Task [%s] (pool=%s) status [%s] duration [%d] ms", taskName, poolName, wasException ? "EXCEPTION" : "SUCCESS", end - start);
                MDC.remove("pool");
                MDC.remove("taskName");
            }
        });
    }
}
