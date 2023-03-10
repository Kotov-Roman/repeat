package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorsSample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CountDownLatch lock = new CountDownLatch(10);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
            System.out.println(lock.getCount());
        }, 500, 500, TimeUnit.MILLISECONDS);
        System.out.println("ROMAA");
//        lock.await(950, TimeUnit.MILLISECONDS);
        lock.await();

        future.cancel(true);
        Thread.currentThread().interrupt();
    }

}
