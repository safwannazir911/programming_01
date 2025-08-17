package dsa.p3;

public class ReverseArray {

    void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    void reverse(int[] arr){
        int s=0;
        int end=arr.length-1;

        while(s<end){
            swap(arr,s,end);
            s++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        ReverseArray obj=new ReverseArray();
        obj.reverse(arr);

        

        for(int i:arr){
            System.out.print(i);
        }
    }

}
