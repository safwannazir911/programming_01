package dsa.p1;

import java.util.HashMap;

public class Hash {

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 2);

        System.out.println(map.containsValue(2)); // Output: 1

    }
}
