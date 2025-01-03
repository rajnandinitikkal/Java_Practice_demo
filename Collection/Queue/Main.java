package Collection.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
// import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayBlockingQueue<>(7);
        System.out.println(queue.poll());
        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            System.out.println(queue.offer(6));
            System.out.println(queue.poll());
            queue.add(7);

        }catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}