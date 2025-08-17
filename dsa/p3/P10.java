package dsa.p3;

//Stack using Arrays

public class P10 {
    static int top=-1;

    static void enstack(int[] arr,int val){
        if(top<arr.length-1){
            arr[++top]=val;
        }
        else {
            System.out.print("Stack Overflow");
        }
    }
    static void destack(){
        if (top>=0){
            top--;
        }
    }

    static void peek(int[] arr){
        System.out.print(arr[top]);
    }

    static void print(int[] arr){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){


        int[] stack=new int[5];


        enstack(stack,5);
        enstack(stack,6);
        enstack(stack,7);
        enstack(stack,8);
        enstack(stack,9);


        destack();
        destack();
        destack();

        peek(stack);

        print(stack);

    }
}
