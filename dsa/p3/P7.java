package dsa.p3;
//Merge sort

public class P7 {
    static void mergeSortedArrays(int[] arr, int initial, int mid, int f) {

        int[] temp=new int[f-initial+1];
        int index=0;

        int a=initial;
        int b=mid+1;

        while(a<=mid && b<=f){
            if(arr[a]<arr[b]){
                temp[index]=arr[a];
                index++;
                a++;
            }
            else {
                temp[index]=arr[b];
                index++;
                b++;
            }

        }

        while (a<=mid){
            temp[index]=arr[a];
            index++;
            a++;
        }
        while (b<=f){
            temp[index]=arr[b];
            index++;
            b++;
        }

        index=0;
        for(int i=initial;i<=f;i++){
            arr[i]=temp[index];
            index++;
        }
    }

    static void mergeSort(int[] arr, int i, int f) {
        if ((f - i) == 0) {
            return;
        }
        int mid = i + (f - i) / 2;

        mergeSort(arr, i, mid);
        mergeSort(arr, mid + 1, f);

        //mergeSorted
        mergeSortedArrays(arr, i, mid, f);

    }

    public static void main(String[] args) {

        int[] arr = {8, 6, 3, 13, 45, 6, 8, 63};

        mergeSort(arr, 0, arr.length - 1);

        for (int e : arr) {
            System.out.print(e+" ");
        }
    }
}
