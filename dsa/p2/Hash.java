package dsa.p2;
// Java program to design HashMap
import java.util.*;

public class Hash {
    int[] mapArray;
    public Hash()
    {
        mapArray = new int[11];
        Arrays.fill(mapArray, -1);
    }

    public void put(int key, int value)
    {
        mapArray[key] = value;
    }

    public int get(int key) { return mapArray[key]; }

    public void remove(int key) { mapArray[key] = -1; }

    // Drivers code
    public static void main(String args[])
    {
        Hash hashMap = new Hash();
        hashMap.put(1, 1);
        hashMap.put(10, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(10));

    }
}
