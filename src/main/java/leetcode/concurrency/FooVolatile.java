package leetcode.concurrency;

//https://leetcode.com/problems/print-in-order/
class FooVolatile {

    volatile int counter = 1;

    public FooVolatile() {

    }

    public void first(Runnable printFirst) throws InterruptedException {


        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        counter=2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (counter != 2) {
//            Thread.sleep(0,1);

        }

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        counter=3;

    }

    public void third(Runnable printThird) throws InterruptedException {
        while (counter != 3) {
//            Thread.sleep(0,1);

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
