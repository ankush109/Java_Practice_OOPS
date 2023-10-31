class A extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println("hello");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("hi");
        }
    }
}

public class th1 extends Thread {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.start();
        ob2.start();
    }
}
