
// import static java.lang.Thread.sleep;

class MyCounter extends Thread{
   private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println("Thread No: "+ threadNo + " and Iteration no: "+i);
        }
    }
}
    public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();

        counter1.countMe();

        System.out.println("*********************");

        counter2.countMe();
        long endTime = System.currentTimeMillis();
        System.out.println("Total required time in process: "+(endTime-startTime));

    }
}