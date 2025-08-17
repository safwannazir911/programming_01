package dsa.p3;

// Quick Sort
public class P6 {
    static void swap(int[] arr, int i, int f) {
        int temp = arr[i];
        arr[i] = arr[f];
        arr[f] = temp;
    }

    static int shift(int[] arr, int i, int f) {
        int a = i - 1;
        int b = i;

        int pivot = arr[f];
        while (b < f) {
            if (arr[b] > pivot) {
                b++;
            } else {
                a++;
                swap(arr, a, b);
                b++;
            }
        }
        a++;
        swap(arr, a, f);
        return a;
    }

    static void quickSort(int[] arr, int i, int f) {

        if (f - i < 2) {
            return;
        }
        //place the pivot element at its correct position
        int pivotIndex= shift(arr, i, f);

        quickSort(arr, i, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, f);
    }

    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 2, 1};

        quickSort(arr, 0, arr.length - 1);

        for (int e : arr) {
            System.out.print(e);
        }
    }
}
