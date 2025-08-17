package dsa.p3;

public class LCS {

    public static int lcs(char[] a, char[] b, int c,int d) {
        if(c==-1||d==-1){
            return 0;
        }

        int result=0;
        if (a[c] == b[d]) {
            result=1+lcs(a,b,c-1,d-1) ;
        }
        else{
            result=Math.max(lcs(a,b,c-1,d),lcs(a,b,c,d-1));
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "RMKAX";
        String b = "RNAX";


        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();

        System.out.print( lcs(a1,a2,a.length()-1,b.length()-1));

    }
}
