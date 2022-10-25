package SortKArray;

import java.util.PriorityQueue;

public class SortKArray {
    private static void sortK(int number[], int k) {
        PriorityQueue<Integer> name = new PriorityQueue<>();
        for (int i = 0; i < k + 1; i++) {
            name.add(number[i]);
        }

        int index = 0;
        for (int i = k + 1; i < number.length; i++) {
            number[index++] = name.peek();
            name.poll();
            name.add(number[i]);
        }
        while (name.isEmpty() == false) {
            number[index++] = name.poll();
        }
    }

    private static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int find = 3;
        int number[] = { 2, 6, 3, 12, 56, 8 };
        sortK(number, find);
        System.out.println("Following is sorted array");
        printArray(number);
    }
}
