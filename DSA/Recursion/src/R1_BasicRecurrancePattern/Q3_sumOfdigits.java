package R1_BasicRecurrancePattern;

public class Q3_sumOfdigits {
    public static void main(String[] args) {


        System.out.println(sum(89123));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + sum(n/10);
    }
}
