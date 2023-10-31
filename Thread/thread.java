import java.util.Scanner;

class odd implements Runnable {
    int l;
    int h;

    odd(int l, int h) {
        this.l = l;
        this.h = h;
    }

    public void run() {
        int i;
        try {
            for (i = l; i <= h; i++) {
                Thread.sleep(1000);
                if (i % 2 != 0) {
                    System.out.println("Odd number from the list: " + i);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class even implements Runnable {
    int l, h;

    even(int l, int h) {
        this.l = l;
        this.h = h;
    }

    public void run() {
        int i;
        for (i = l; i <= h; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println("Even number from the list: " + i);
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.println("Enter upper limit: ");
        int high = sc.nextInt();
        odd t1 = new odd(low, high);
        Thread tt1 = new Thread(t1);
        even t2 = new even(low, high);
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt2.start();
    }
}