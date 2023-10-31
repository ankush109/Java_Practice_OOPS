class A {
    int count;

    public synchronized void increment() {
        count += 1;
    }
}

public class Run {
    public static void main(String[] args) throws InterruptedException {
        A c = new A();
        Runnable ob1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable ob2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Thread t2 = new Thread(ob1);
        Thread t1 = new Thread(ob2);
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(c.count);
    }
}
