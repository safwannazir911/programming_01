package dsa.p1;

public class Fibonacci {


    public static void main(String[] args){
        System.out.println(fib(6));
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
}
