package dsa.p1;

public class MergeSort {


    public static void main(String[] args) {
        int[] elements = {12, 11, 13, 5, 6, 7};

        mergeSort(elements, 0, elements.length-1);

        for (int num : elements) {
            System.out.println(num);
        }

    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int j = 0;
        int k = 0;

        int index = low;

        while (j < left.length && k < right.length) {
            if (left[j] > right[k]) {
                arr[index] = right[k];
                k++;
            } else {
                arr[index] = left[j];
                j++;
            }
            index++;
        }

        while (j < left.length) {
            arr[index] = left[j];
            index++;
            j++;
        }

        while (k < right.length) {
            arr[index] = right[k];
            index++;
            k++;
        }
    }

}
