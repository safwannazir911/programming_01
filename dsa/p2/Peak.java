package dsa.p2;

public class Peak {


    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7,8,9,3,2,1};

        int peak=0;

        for(int i:arr){
            if(i>peak){
                peak=i;
            }
            else break;
        }

        System.out.print(peak);

    }
}
