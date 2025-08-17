package dsa.p2;

public class Palindrome {

    static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        boolean isPalin=true;

        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                isPalin=false;
                break;
            }
        }

        return isPalin;
    }


    public static void main(String[] args){

        String s="h";

        if(isPalindrome(s)){
            System.out.print("dsa.p1.Palindrome");
        }
        else{
            System.out.print("Not a dsa.p1.Palindrome");
        }
    }

}
