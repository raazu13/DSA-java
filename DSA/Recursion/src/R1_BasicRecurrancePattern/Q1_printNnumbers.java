package R1_BasicRecurrancePattern;

public class Q1_printNnumbers {
    public static void main(String[] args) {

        print(5);
    }
    public static void print(int n){
        if(n==0){     // base Case
            return;
        }
        System.out.println(n);
        print(n-1);   // recursive call
    }
}
