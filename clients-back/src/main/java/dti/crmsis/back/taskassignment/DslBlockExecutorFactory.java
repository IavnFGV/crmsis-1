package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.dsl.DslRefBlock;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class DslBlockExecutorFactory {
    @Inject
    DslExecutorRegistry dslExecutorRegistry;

    private final Map<String, Instance<? extends DslBlockExecutor>> blockExecutors = new ConcurrentHashMap<>();

    private static final String UNKNOWN_BLOCK_TYPE_MESSAGE = "Unknown block type: ";
    @Inject
    BeanManager beanManager;

    public void initializeBlockExecutors() {
        Set<Bean<?>> beans = beanManager.getBeans(DslBlockMarker.class);
        for (Bean<?> bean : beans) {
            if (DslBlockExecutor.class.isAssignableFrom(bean.getBeanClass())) {
                Class<?> executorClass = bean.getBeanClass();
                BlockType blockTypeAnnotation = executorClass.getAnnotation(BlockType.class);

                if (blockTypeAnnotation != null) {
                    @SuppressWarnings("unchecked")
                    Instance<? extends DslBlockExecutor> executorInstance =
                            (Instance<? extends DslBlockExecutor>) CDI.current().select(executorClass);
                    blockExecutors.put(blockTypeAnnotation.value(), executorInstance);
                }
            }
        }
    }

    public <T extends DslBlock> DslBlockExecutor<T> createBlockExecutorFor(T block) {
        Objects.requireNonNull(block, "DslBlock cannot be null");

        Instance<? extends DslBlockExecutor> executorInstance = blockExecutors.get(block.getType());
        if (executorInstance == null) {
            throw new UnknownBlockTypeException(UNKNOWN_BLOCK_TYPE_MESSAGE + block.getType());
        }

        @SuppressWarnings("unchecked")
        DslBlockExecutor<T> executor = (DslBlockExecutor<T>) executorInstance.get();
        return executor;
    }

    public DslBlockExecutor getBlockExecutorFor(DslBlock dslBlock) {
        Objects.requireNonNull(dslBlock, "DslBlock cannot be null");
        if (dslBlock instanceof DslRefBlock) {
            DslBlockExecutor<DslBlock> dslBlockDslBlockExecutor = dslExecutorRegistry.get(((DslRefBlock) dslBlock).getRef());
            return dslBlockDslBlockExecutor;
        }
        Instance<? extends DslBlockExecutor> executorInstance = blockExecutors.get(dslBlock.getType());
        return executorInstance.get();
    }

    public static class UnknownBlockTypeException extends RuntimeException {
        public UnknownBlockTypeException(String message) {
            super(message);
        }

    }
}
