package dsa.p3;
//Binary search
public class P5 {

    static boolean binarySearch(int[] arr,int i,int f,int element){
        int mid=i+(f-i)/2;
        if(mid==element) return true;
        else if (element<mid){
            binarySearch(arr,i,mid,element);
        }
        else {
            binarySearch(arr,mid+1,f,element);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={2,3,4,5,8,9,12};
        int element=3;

        if (binarySearch(arr,0,arr.length,element)){
            System.out.print("Found");
        }
        else {
            System.out.print("Not Found");
        }

    }

}
