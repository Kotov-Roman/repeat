package leetcode.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    CountDownLatch forSecond = new CountDownLatch(1);
    CountDownLatch forThird = new CountDownLatch(1);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {


        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        forSecond.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        forSecond.await();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        forThird.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        forThird.await();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
