package R1_BasicRecurrancePattern;

public class Q2_factorial {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
