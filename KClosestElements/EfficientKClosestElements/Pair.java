package KClosestElements.EfficientKClosestElements;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Pair {
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public static void main(String[] args) {

    }
}

class Test {
    public static void printKClosest(int number[], int k, int num) {
        PriorityQueue<Pair> name = new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair num1, Pair num2) {
                return num2.getValue().compareTo(num1.getValue());
            }
        });
        for (int i = 0; i < k; i++) {
            name.offer(new Pair(number[i], Math.abs(number[i] - num)));
        }
        for (int i = k; i < number.length; i++) {
            int diff = Math.abs(number[i] - num);
            if (name.peek().getValue() > diff) {
                name.poll();
                name.offer(new Pair(number[i], diff));
            }
        }
        while (!name.isEmpty()) {
            System.out.println(name.poll().getKey() + " ");
        }
    }

    public static void main(String[] args) {
        int number[] = { 10, 30, 5, 40, 38, 80, 70 };
        int num = 35;
        int k = 3;
        printKClosest(number, k, num);
    }
}
