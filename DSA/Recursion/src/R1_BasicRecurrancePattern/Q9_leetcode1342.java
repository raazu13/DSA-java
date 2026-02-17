package R1_BasicRecurrancePattern;// number of steps to reduce a number to zero

//if number is even divide it by 2 and if it is odd subtract it by one;
public class Q9_leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int n){
        int step =0;

         return helper( n,step);

    }

    public static int helper(int n, int step){
        if(n==0){
            return step;
        }

        if(n%2==0){
            return helper(n/2,step+1);
        }else{
            return helper(n-1,step+1);
        }
    }
}
