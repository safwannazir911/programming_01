package dsa.p3;
//Find the largest/smallest element in an array.


public class P1 {

    static int findLargest(int[] arr) {
        int largest=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    static int findSmallest(int[] arr) {
        int smallest=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,7,777,77,2};

        System.out.print(findLargest(arr)+" ");

        System.out.print(findSmallest(arr));

    }
}
