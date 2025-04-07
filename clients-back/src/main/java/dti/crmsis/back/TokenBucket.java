package dti.crmsis.back;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {

    private final int capacity;
    private final AtomicInteger tokens;
    private final Object lock = new Object();

    public TokenBucket(int capacity) {
        this.capacity = capacity;
        this.tokens = new AtomicInteger(capacity);

        Thread refillThread = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    tokens.set(capacity);
                    lock.notifyAll(); // разбудить ожидающие потоки
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        refillThread.setDaemon(true);
        refillThread.start();
    }

    public void consume() throws InterruptedException {
        synchronized (lock) {
            while (tokens.get() == 0) {
                lock.wait();
            }
            tokens.decrementAndGet();
        }
    }
}
