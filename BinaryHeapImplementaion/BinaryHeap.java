package BinaryHeapImplementaion;

public class BinaryHeap {
    int HeapNumber[];
    int size;
    int capacity;

    public BinaryHeap(int c) {
        capacity = c;
        size = 0;
        HeapNumber = new int[c];
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

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(11);
    }
}