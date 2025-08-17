package dsa.p3;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (map.containsKey(remaining)) {
                //return the index in map along with current index
                return new int[]{map.get(remaining), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 6};
        int target = 9;


        int[] a = twoSum(arr, target);
        System.out.print(a[0] + " " + a[1]);


    }
}
