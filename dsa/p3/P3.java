package dsa.p3;
//Check if two strings are anagrams of each other.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class P3 {

    static boolean isMatching(int index,char[] s1, char[] s2,HashSet<Integer> set) {
            boolean matched=false;
            for (int i=0;i<s2.length;i++){
                if(!set.contains(i) && s1[index]==s2[i]){
                    set.add(i);
                    return true;
                }
            }

            return matched;
    }

    static boolean isAnagram(String s1, String s2) {

        HashSet<Integer> set = new HashSet<>();

        char[] s_1 = s1.toCharArray();
        char[] s_2 = s2.toCharArray();

        for (int i = 0; i < s_1.length; i++) {
            if (!isMatching(i,s_1,s_2,set)) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {

        String s1 = "heed";
        String s2 = "eehk";


        System.out.print(isAnagram(s1, s2));

    }
}
