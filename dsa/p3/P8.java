package dsa.p3;

//Bubble sort

public class P8 {
    static void swap(int[] arr, int i, int f) {
        int temp = arr[i];
        arr[i] = arr[f];
        arr[f] = temp;
    }
    static void bubbleSort(int[] arr){
        int f=arr.length-1;
        for(int i=0;i<f;i++){
            for(int j=0;j<f-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={9,5,4,3,2,1};

        bubbleSort(arr);

        for (int e : arr) {
            System.out.print(e+" ");
        }
    }
}
