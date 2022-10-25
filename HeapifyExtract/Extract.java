package HeapifyExtract;

public class Extract {
    int size;
    int capacity;
    int numb[];

    public Extract(int c) {
        size = 0;
        capacity = c;
        numb = new int[c];
    }

    int rigth(int number) {
        return 2 * number + 2;
    }

    int left(int number) {
        return 2 * number + 1;
    }

    public int ExtractMin() {
        if (size <= 0) {
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            size--;
            return numb[0];
        }
        int temp = numb[0];
        numb[0] = numb[size - 1];
        numb[size - 1] = temp;
        size--;
        return numb[size];
    }

    public static void main(String[] args) {
        Extract ext = new Extract(11);
    }
}
