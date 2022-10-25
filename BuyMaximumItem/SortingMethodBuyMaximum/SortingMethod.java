package BuyMaximumItem.SortingMethodBuyMaximum;

import java.util.Arrays;

public class SortingMethod {
    public static void main(String[] args) {
        int num = 5;
        int sum = 10;
        int cost[] = new int[] { 1, 12, 5, 111, 200 };

        int res = 0;
        Arrays.sort(cost);
        for (int i = 0; i < num; i++) {
            if (cost[i] <= sum) {
                sum -= cost[i];
                res++;
            } else {
                break;
            }
        }
        System.out.println(res);
    }
}
