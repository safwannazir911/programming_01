package dsa.p2;

import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> hashMap=new HashMap<>();

        hashMap.put("Safwan",90);
        hashMap.put("Ali",90);
        hashMap.put("Zara",90);

        System.out.println(hashMap.entrySet());

        for(String k:hashMap.keySet()){
            System.out.print(hashMap.get(k)+" ");
        }


    }

}
