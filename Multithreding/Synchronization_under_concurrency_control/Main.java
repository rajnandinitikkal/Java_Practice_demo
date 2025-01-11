package Multithreding.Synchronization_under_concurrency_control;

public class Main {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    Main.counter++;
                }
//                System.out.println("The loop in thread 1 is over ");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    Main.counter++;
                }
//                System.out.println("The loop in thread 1 is over ");
            }
        }).start();

        System.out.println(counter);
    }
}