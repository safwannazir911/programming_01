package dsa.p2;

public class BubbleSort {

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, j, i);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int f) {
        int temp = arr[i];
        arr[i] = arr[f];
        arr[f] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 42, 1, 34, 4, 2, 123, 13, 1, 1};

        sortArray(arr);

        for (int e : arr) {
            System.out.print(e+" ");
        }
    }

}
