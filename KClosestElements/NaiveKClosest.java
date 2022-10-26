package KClosestElements;

public class NaiveKClosest {
    public static void printKClosest(int arr[], int k, int x) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < k; i++) {

            int min_diff = Integer.MAX_VALUE;
            int min_diff_idx = 0;

            for (int j = 0; j < arr.length; j++) {
                if (visited[j] == false && Math.abs(arr[j] - x) <= min_diff) {
                    min_diff = Math.abs(arr[j] - x);
                    min_diff_idx = j;
                }
            }
            System.out.print(arr[min_diff_idx] + " ");
            visited[min_diff_idx] = true;
        }
    }

    public static void main(String[] args) {
        int number[] = { 10, 30, 5, 40, 38, 80, 70 };
        int x = 35;
        int k = 3;
        printKClosest(number, k, x);
    }
}
