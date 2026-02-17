package R2_TwoBranchRecursion;

import R1_BasicRecurrancePattern.Q1_printNnumbers;

public class Q2_Fbibonaci {
    public static void main(String[] args) {

        int ans= fibo(6);
        System.out.println(ans);

        Q1_printNnumbers.print(7);

    }
    static int fibo(int n){

        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
