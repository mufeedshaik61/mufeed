class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // 3 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MainMethod1 {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();

        t1.start();
        t2.start();
        t3.start();
    }
}