package DSA;

import java.util.*;

public class MaxHeapDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.add(5);
        pq.add(3);
        pq.add(89);
        pq.add(56);
        pq.add(4);

        System.out.println("Top element: " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
