package dsa.p2;

import java.util.HashSet;

public class MyHashSet {


    public static void main(String[] args){

        HashSet<Integer> set=new HashSet<>();

        set.add(33);
        set.add(34);
        set.add(35);


        System.out.println(set.contains(33));

        for(Integer k:set){
            System.out.print(k+ " ");
        }

    }


}
