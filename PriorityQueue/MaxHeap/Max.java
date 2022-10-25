package PriorityQueue.MaxHeap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Max {
    public static void main(String[] args) {
        PriorityQueue<Integer> name = new PriorityQueue<>(Collections.reverseOrder());

        name.add(10);
        name.add(20);
        name.add(15);

        // Above PriorityQueue is stored as following
        // 20
        // / \
        // 10 15

        // Printing the top element of PriorityQueue

        System.out.println(name.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(name.poll());

        // Post poll() PriorityQueue looks like
        // 15
        // /
        // 10

        // Printing the top element again
        System.out.println(name.peek());
    }
}
