package dsa.p3;

//Find the next greater element in an array.


public class P4 {
    static int nextLargest(int[] arr,int largestIndex) {
        int index=largestIndex;
        int difference=arr[largestIndex];
        for(int i=0;i<arr.length;i++){
            if(i!=largestIndex && arr[largestIndex]-arr[i]<difference){
                difference=arr[largestIndex]-arr[i];
                index=i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,5,56,8,55};
        System.out.print(nextLargest(arr, 4));
    }
}
