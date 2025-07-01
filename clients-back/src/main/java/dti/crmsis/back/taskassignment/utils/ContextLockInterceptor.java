package dti.crmsis.back.taskassignment.utils;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.jboss.logging.Logger;

import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantLock;

@WithContextLock
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class ContextLockInterceptor {

    private static final Logger LOG = Logger.getLogger(ContextLockInterceptor.class);


    @AroundInvoke
    public Object manageLock(InvocationContext ctx) throws Exception {

        Method method = ctx.getMethod();

        WithContextLock annotation = method.getAnnotation(WithContextLock.class);
        if (annotation == null) {
            annotation = ctx.getTarget().getClass().getAnnotation(WithContextLock.class);
        }

        boolean skipIfCompleted = annotation != null && annotation.skipIfCompleted();

        for (Object param : ctx.getParameters()) {
            if (param instanceof TaskAssignmentContext taskContext) {
                if (skipIfCompleted && taskContext.isCompleted()) {
                    LOG.info("Skipping execution due to completed context");
                    throw new ContextIsCompletedException();
                }
                ReentrantLock lock = taskContext.getLock();
                lock.lock();
                try {
                    return ctx.proceed();
                } finally {
                    lock.unlock();
                }
            }
        }
        return ctx.proceed();
    }
}
