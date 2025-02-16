package dti.crmsis.back;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@MetricsInterceptorBinding
@Interceptor
public class MetricsInterceptor {

    @Inject
    private MeterRegistry meterRegistry;

    @AroundInvoke
    Object aroundInvoke(InvocationContext ic) throws Exception {
        String methodName = ic.getMethod().getName();
        String className = ic.getMethod().getDeclaringClass().getName();
        Timer.Sample timer = Timer.start(meterRegistry);
        meterRegistry.counter(className + "." + methodName).increment();
        try {
            return ic.proceed();
        } catch (Throwable e) {
            meterRegistry.counter(className + "." + methodName + ".ERROR").increment();
            timer.stop(meterRegistry.timer("timer-" + className + "." + methodName + ".ERROR"));
            throw e;
        } finally {
            timer.stop(meterRegistry.timer("timer-" + className + "." + methodName));
        }
    }
}
