import java.util.concurrent.Semaphore;

class Foo {
    private Semaphore sem1;
    private Semaphore sem2;

    public Foo() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        sem1.release(); // allow second() to run
    }

    public void second(Runnable printSecond) throws InterruptedException {
        sem1.acquire(); // wait until first() finishes
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        sem2.release(); // allow third() to run
    }

    public void third(Runnable printThird) throws InterruptedException {
        sem2.acquire(); // wait until second() finishes
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
