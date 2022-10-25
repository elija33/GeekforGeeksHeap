package BuyMaximumItem.HeapBuyMaximumItem;

import java.util.PriorityQueue;

public class HeapBuyMax {
    public static void main(String[] args) {
        int number = 5;
        int sum = 10;
        int cost[] = new int[] { 1, 12, 5, 111, 200 };

        PriorityQueue<Integer> num = new PriorityQueue<>();
        int res = 0;
        for (int i = 0; i < number; i++)
            num.add(cost[i]);

        for (int i = 0; i < number; i++) {
            if (num.peek() <= sum) {
                sum -= num.poll();
                res++;
            } else {
                break;
            }
        }
        System.out.println(res);
    }
}
