package Collection.Dqueue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedBlockingDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println(deque);

        deque.offerFirst(0);
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);
    }
}