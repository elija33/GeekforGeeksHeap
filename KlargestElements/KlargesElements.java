package KlargestElements;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KlargesElements {
    public static void firstkElements(int number[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(number[i]);
        }
        for (int i = k; i < number.length; i++) {
            if (minHeap.peek() > number[i]) {
                continue;
            } else {
                minHeap.poll();
                minHeap.add(number[i]);
            }
        }
        Iterator ite = minHeap.iterator();

        while (ite.hasNext()) {
            System.out.println(ite.next() + " ");
        }
    }

    public static void main(String[] args) {
        int number[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int k = 3;
        firstkElements(number, k);
    }
}
