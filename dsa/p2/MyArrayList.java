package dsa.p2;

import java.util.ArrayList;
import java.util.Arrays; // Important!
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        Integer[] arr = {33, 44}; // Use Integer[], not int[]

        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); // Correct way
        list.add(22);
        list.add(23);
        list.add(24);

        System.out.print(list);
    }
}
