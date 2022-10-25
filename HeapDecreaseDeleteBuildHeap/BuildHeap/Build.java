package HeapDecreaseDeleteBuildHeap.BuildHeap;

public class Build {
    int size;
    int capacity;
    int number[];

    public Build(int c) {
        size = 0;
        number = new int[c];
        capacity = c;
    }

    public int rigth(int num) {
        return 2 * num + 2;
    }

    public int left(int num) {
        return 2 * num + 1;
    }

    public int parent(int num) {
        return (num - 1) / 2;
    }

    public void minHeapify(int i) {
        int leftword = left(i);
        int rightword = rigth(i);
        int smallest = i;
        if (leftword < size && number[leftword] < number[i]) {
            smallest = leftword;
        }
        if (rightword < size && number[rightword] < number[i]) {
            smallest = rightword;
        }
        if (smallest != i) {
            int temp = number[i];
            number[i] = number[smallest];
            number[smallest] = temp;
            minHeapify(smallest);
        }
    }

    public void buildHeap() {
        for (int i = (size - 2) / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    public static void main(String[] args) {
        Build word = new Build(11);
    }
}
