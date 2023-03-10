package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreExample {

    public static void main(String[] args) {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginQueueUsingSemaphore loginQueue = new LoginQueueUsingSemaphore(slots);
        IntStream.range(0, slots)
                .forEach(user -> executorService.execute(loginQueue::tryLogin));
        System.out.println("shutdown before");
        executorService.shutdown();
        System.out.println("shutdown after");
    }


    private static class LoginQueueUsingSemaphore {

        private Semaphore semaphore;

        public LoginQueueUsingSemaphore(int slotLimit) {
            semaphore = new Semaphore(slotLimit);
        }

        boolean tryLogin() {
            boolean success = semaphore.tryAcquire();
            if (success) {
                System.out.println(" lock received");

            } else {
                System.out.println(" lock is not received");
            }
            return success;
        }

        void logout() {
            semaphore.release();
        }

        int availableSlots() {
            return semaphore.availablePermits();
        }

    }
}
