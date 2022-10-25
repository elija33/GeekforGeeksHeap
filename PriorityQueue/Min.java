package PriorityQueue;

import java.util.PriorityQueue;

public class Min {
    public static void main(String[] args) {

        // Creating empty priority queue
        PriorityQueue<Integer> number = new PriorityQueue<>();

        // Adding items to the PriortyQueue using add()
        number.add(10);
        number.add(20);
        number.add(15);

        // Printing the top element of PriortyQueue
        System.out.println(number.peek());

        // Printing the top element and removing it.
        // from the PriorityQueue container
        System.out.println(number.poll());

        // Printing the top element again.
        System.out.println(number.peek());
    }
}
