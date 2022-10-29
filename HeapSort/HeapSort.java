package HeapSort;

public class HeapSort {
    public void buildheap(int number[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(number, n, i);
        }
    }

    public void sort(int number[]) {
        buildheap(number, 0);

        for (int i = number.length - 1; i > 0; i--) {
            int temp = number[0];
            number[0] = number[i];
            number[i] = temp;

            heapify(number, i, 0);
        }
    }

    public void heapify(int number[], int n, int i) {
        int largest = i;
        int left = 2 * i + 2;
        int rigth = 2 * i + 1;

        if (left < n && number[left] > number[largest])
            largest = left;

        if (rigth < n && number[rigth] > number[largest])
            largest = rigth;

        if (largest != i) {
            int swap = number[i];
            number[i] = number[largest];
            number[largest] = swap;

            heapify(number, n, largest);
        }
    }

    public static void printArray(int number[]) {
        for (int i = 0; i < number.length - 1; ++i) {
            System.out.print(number[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numb[] = { 12, 11, 13, 5, 6, 7 };
        HeapSort name = new HeapSort();
        name.sort(numb);

        System.out.println("Sorted array is");
        printArray(numb);
    }
}
