package dsa.p2;

public class BinarySearch {

    static int binSearch(int[] arr,int key){

        int i=0;
        int f=arr.length-1;

        while(i<=f){
            int mid=i+(i+f)/2;
            if(arr[mid]==key) return mid;
            else if (key>arr[mid]) {
                i=mid+1;
            }
            else{
                f=mid-1;
            }
        }

        return -1;
    }



    public static void main(String[] args){

        int[] arr={2,3,6,7,9,11,22,44};
        int element=7;

        System.out.print(binSearch(arr,element));


    }
}
