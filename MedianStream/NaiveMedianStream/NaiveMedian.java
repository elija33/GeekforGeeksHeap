package MedianStream.NaiveMedianStream;

public class NaiveMedian {
    public static void main(String[] args) {
        double number[] = new double[] { 25, 7, 10, 15, 20 };
        int num = 5;
        double temp[] = new double[num];
        int size = 0;
        for (int i = 0; i < num; i++) {
            temp[i] = number[i];
            size++;
            int j = i;
            while (j > 0 && temp[j] < temp[j - 1]) {
                double nums = temp[j];
                temp[j] = temp[j - 1];
                temp[j - 1] = nums;
                j--;
            }
            if (size % 2 != 0) {
                System.out.println(temp[size / 2] + " ");
            } else {
                System.out.println(((temp[size / 2] + temp[size - 1] / 2) / 2) + " ");
            }
        }
    }
}
