package dsa.p3;

import java.util.ArrayList;

public class RemoveDuplicatesString {


    public static void main(String[] args) {
        String s = "Safwann";
        char[] charArray = s.toCharArray();
        ArrayList<Integer> indexesToDelete = new ArrayList<>();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    indexesToDelete.add(i);
                    indexesToDelete.add(j);
                    break;
                }
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            if (!indexesToDelete.contains(i)) {
                System.out.print(charArray[i]);
            }

        }

    }
}
