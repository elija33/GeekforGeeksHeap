package MergeKSortedArrays.NaiveMergeKSortedArrays;

import java.util.ArrayList;

public class NaiveMergeKSort {
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> number, ArrayList<Integer> arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        while (i < number.size() && j < arr2.size()) {
            if (number.get(i) < arr2.get(j))
                arr3.add(number.get(i++));
            else
                arr3.add(arr2.get(j++));
        }

        while (i < number.size())
            arr3.add(number.get(i++));

        while (j < arr2.size())
            arr3.add(arr2.get(j++));

        return arr3;
    }

    public static ArrayList<Integer> mergeKArrays(ArrayList<ArrayList<Integer>> arr) {
        ArrayList<Integer> res = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            res = mergeArrays(res, arr.get(i));
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        arr.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        a2.add(15);
        arr.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1);
        a3.add(9);
        a3.add(11);
        a3.add(25);
        arr.add(a3);

        ArrayList<Integer> res = mergeKArrays(arr);

        System.out.println("Merged array is ");
        for (int x : res)
            System.out.print(x + " ");
    }
}
