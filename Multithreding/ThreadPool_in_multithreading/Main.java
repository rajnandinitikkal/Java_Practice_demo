package Multithreding.ThreadPool_in_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SameThread extends Thread{
    private String name;

    public SameThread(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("Started Thread: "+name);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended Thread: "+name);
    }
}
public class Main {
    public static void main(String[] args) {

        ExecutorService executorService=  Executors.newFixedThreadPool(6);
        SameThread thread1 = new SameThread("Thread 1");
        SameThread thread2 = new SameThread("Thread 2");
        SameThread thread3 = new SameThread("Thread 3");
        SameThread thread4 = new SameThread("Thread 4");
        SameThread thread5 = new SameThread("Thread 5");
        SameThread thread6 = new SameThread("Thread 6");
        SameThread thread7 = new SameThread("Thread 7");
        SameThread thread8 = new SameThread("Thread 8");
        SameThread thread9 = new SameThread("Thread 9");
        SameThread thread10 = new SameThread("Thread 10");
        SameThread thread11 = new SameThread("Thread 11");
        SameThread thread12 = new SameThread("Thread 12");

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);

        executorService.shutdown();
    }
}