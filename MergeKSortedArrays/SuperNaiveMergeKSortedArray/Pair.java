package MergeKSortedArrays.SuperNaiveMergeKSortedArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getkey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setkey(int key) {
        this.key = key;
    }

    public void setValue() {
        this.value = value;
    }
}

class Test {
    public static ArrayList<Integer> mergekArrays(ArrayList<ArrayList<Integer>> number) {
        ArrayList<Integer> name = new ArrayList<>();

        for (ArrayList<Integer> world : number) {
            for (Integer worlds : world)
                name.add(worlds);
        }
        Collections.sort(name);
        return name;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> name = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> names = new ArrayList<Integer>();
        names.add(10);
        names.add(20);
        names.add(30);
        name.add(names);

        ArrayList<Integer> names1 = new ArrayList<>();
        names1.add(5);
        names1.add(15);
        name.add(names1);

        ArrayList<Integer> names2 = new ArrayList<>();
        names2.add(1);
        names2.add(9);
        names2.add(11);
        names2.add(18);
        name.add(names2);

        ArrayList<Integer> res = mergekArrays(name);
        System.out.println("Merged array is ");
        for (int total : res) {
            System.out.print(total + " ");
        }
    }
}
