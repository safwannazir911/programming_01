package dsa.p3;
//Check if a string is a palindrome.


public class P2 {

    static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while (r>l){
            if(s.charAt(r)==s.charAt(l)){
                l++;
                r--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s="heeh";
        System.out.print(isPalindrome(s));

    }
}
