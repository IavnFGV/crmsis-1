package dti.crmsis.back.utils;


import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.jboss.logging.Logger;

@Retry
@Interceptor
@Priority(2024)
public class RetryInterceptor {

    private static final Logger LOG = Logger.getLogger(RetryInterceptor.class);

    @AroundInvoke
    public Object retry(InvocationContext ctx) throws Exception {
        Retry annotation = ctx.getMethod().getAnnotation(Retry.class);
        if (annotation == null) {
            annotation = ctx.getTarget().getClass().getAnnotation(Retry.class);
        }

        int maxRetries = annotation != null ? annotation.maxRetries() : 3;
        long delayMs = annotation != null ? annotation.delayMs() : 1000;

        int attempt = 0;
        while (true) {
            try {
                return ctx.proceed();
            } catch (Exception ex) {
                attempt++;
                if (attempt > maxRetries) {
                    LOG.errorf("Retries exceeded (%d): %s", maxRetries, ex.getMessage());
                    throw ex;
                }
                LOG.warnf("Retry %d/%d due to %s", attempt, maxRetries, ex.getClass().getSimpleName());
                try {
                    Thread.sleep(delayMs * attempt); // экспоненциально можно при желании
                } catch (InterruptedException ignored) {}
            }
        }
    }
}
