package dsa.p1;

public class BubbleSort {

    public static void main(String[] args){
        int[] elements={2,4,2,4,2,3,34,3,45,6};

        bubbleSort(elements);

        for (int num : elements) {
            System.out.println(num);
        }

    }

    static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }

            }
        }
    }
    static void swap(int m, int n, int[] elements) {
        int temp = elements[m];
        elements[m] = elements[n];
        elements[n] = temp;
    }

}
