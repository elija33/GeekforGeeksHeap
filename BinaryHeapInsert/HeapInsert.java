package BinaryHeapInsert;

import java.security.DrbgParameters.Capability;

import javax.print.attribute.standard.Sides;

public class HeapInsert {
    int size;
    int number[];
    int capacity;

    public HeapInsert(int c) {
        size = 0;
        capacity = c;
        number = new int[c];
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    public void insert(int numb) {
        if (size == capacity)
            return;
        size++;
        number[size - 1] = numb;

        for (int i = size - 1; i != 0 && number[parent(i)] > number[i];) {
            int temp = number[i];
            number[i] = number[parent((i))];
            number[parent(i)] = temp;
            i = parent(i);
        }
    }

    public static void main(String[] args) {
        HeapInsert heap = new HeapInsert(11);
        heap.insert(3);
        heap.insert(2);
        heap.insert(15);
        heap.insert(20);
    }
}
