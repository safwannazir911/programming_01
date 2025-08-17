package dsa.p1;

public class QuickSort {

    public static void main(String[] args) {

        int[] elements = {4, 3, 1, 2, 5, 9, 7, 10, 6};
        int k = elements.length - 1;


        quickSort(elements, 0, k);

        for (int num : elements) {
            System.out.println(num);
        }
    }

    static void quickSort(int[] elements, int low, int high) {
        if (low < high) {
            int partitionIndex = magic(elements, low, high);

            quickSort(elements, low, partitionIndex - 1);
            quickSort(elements, partitionIndex + 1, high);


        }

    }

    static int magic(int[] elements, int low, int high) {
        int pivot = elements[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (elements[j] < pivot) {
                i++;
                swap(i, j, elements);
            }
        }
        swap(i + 1, high, elements);

        return i + 1;

    }


    static void swap(int m, int n, int[] elements) {
        int temp = elements[m];
        elements[m] = elements[n];
        elements[n] = temp;
    }


}
