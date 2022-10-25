package HeapDecreaseDeleteBuildHeap.DecreaseDelete;

public class DecreaseDelete {
    int size;
    int number[];
    int capacity;

    public DecreaseDelete(int c) {
        size = 0;
        capacity = c;
        number = new int[c];
    }

    int right(int num) {
        return 2 * num + 2;
    }

    int left(int num) {
        return 2 * num + 1;
    }

    int parent(int num) {
        return (num - 1) / 2;
    }

    public void insert(int num) {
        if (size == capacity)
            return;
        size++;
        number[size - 1] = num;

        for (int i = size = 1; i != 0 && number[parent(i)] > number[i];) {
            int temp = number[i];
            number[i] = number[parent(i)];
            number[parent(i)] = temp;
            i = parent(i);
        }
    }

    public void minHeapify(int i) {
        int lt = left(i);
        int rt = right(i);
        int smallest = i;
        if (lt < size && number[lt] < number[i])
            smallest = lt;
        if (rt < size && number[rt] < number[smallest])
            smallest = rt;
        if (smallest != i) {
            int temp = number[i];
            number[i] = number[smallest];
            number[smallest] = temp;
            minHeapify(smallest);
        }
    }

    public int ExtractMin() {
        if (size <= 0)
            return Integer.MAX_VALUE;
        if (size == 1) {
            size--;
            return number[0];
        }
        int temp = number[0];
        number[0] = number[size - 1];
        number[size - 1] = temp;
        size--;
        minHeapify(0);

        return number[size];
    }

    public void DecreaseKey(int i, int num) {
        number[i] = num;
        while (i != 0 && number[parent(i)] > number[i]) {
            int temp = number[i];
            number[i] = number[parent(i)];
            number[parent(i)] = temp;
            i = parent(i);
        }
    }

    public void deleteKey(int num) {
        DecreaseKey(num, Integer.MIN_VALUE);
        ExtractMin();
    }

    public static void main(String[] args) {
        DecreaseDelete number = new DecreaseDelete(11);
        number.insert(3);
        number.insert(2);
        number.deleteKey(0);
        number.insert(15);
        number.insert(20);
        System.out.println(number.ExtractMin());
        number.DecreaseKey(2, 1);
        System.out.println(number.ExtractMin());
    }
}
