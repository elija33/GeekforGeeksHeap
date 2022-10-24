package HeapifyExtract;

public class Heapify {
    int size;
    int numbers[];
    int capacity;

    public Heapify(int c) {
        size = 0;
        capacity = c;
        numbers = new int[c];
    }

    int right(int numb) {
        return (2 * numb + 2);
    }

    int left(int numb) {
        return (2 * numb + 1);
    }

    int parent(int numb) {
        return (numb - 1) / 2;
    }

    // Insting a number in the Binary Heap
    public void insert(int numb) {
        if (size == capacity)
            return;
        size++;
        numbers[size - 1] = numb;

        for (int i = size - 1; i != 0 && numbers[parent(i)] > numbers[i];) {
            int temp = numbers[i];
            numbers[i] = numbers[parent(i)];
            numbers[parent(i)] = temp;
            i = parent(i);
        }
    }

    // Not heap into heap
    public void fixit(int number) {
        int leftwork = left(number);
        int rightwork = right(number);
        int smallest = number;
        if (leftwork < size && numbers[leftwork] < numbers[number]) {
            smallest = leftwork;
        }
        if (rightwork < size && numbers[rightwork] < numbers[number]) {
            smallest = rightwork;
        }
        if (smallest != number) {
            int temp = numbers[number];
            numbers[number] = numbers[smallest];
            numbers[smallest] = temp;
            fixit(smallest);
        }
    }

    public static void main(String[] args) {
        Heapify heap = new Heapify(11);
        heap.insert(3);
        heap.insert(2);
        heap.insert(15);
        heap.insert(20);
        System.out.println(heap);
    }
}
