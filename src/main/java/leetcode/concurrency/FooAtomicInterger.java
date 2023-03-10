package leetcode.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

//https://leetcode.com/problems/print-in-order/
public class FooAtomicInterger {
    AtomicInteger atomicInteger = new AtomicInteger(1);
    ReentrantLock reentrantLock = new ReentrantLock();

    public FooAtomicInterger() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (atomicInteger.get() != 1) {
        }
        printFirst.run();
        atomicInteger.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        while (atomicInteger.get() != 2) {
        }
        printSecond.run();
        atomicInteger.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (atomicInteger.get() != 3) {
        }
        printThird.run();
        atomicInteger.incrementAndGet();
    }
}
