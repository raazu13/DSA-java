package R1_BasicRecurrancePattern;

public class Q5_reverseNumber {
    static int sum=0;
    public static void main(String[] args) {

        reverse(3456);
        System.out.println(sum);

        System.out.println(reverse2(4567));
        System.out.println(reverse3(4567));
        System.out.println(reverse4(123,0));
    }

    public static void reverse(int n){
        if(n==0){
            return;
        }
    int remainder =n%10;
        sum=sum*10 +remainder;

        reverse(n/10);


    }

    static int reverse2(int n){
        int digits= (int)Math.log10(n)+1;
        return help(n,digits);
    }

    private static int help(int n, int digits) {
        if(n%10==n){
            return n;
        }

        return (n%10)* (int)(Math.pow(10,digits-1))+help(n/10,digits-1);
    }

    public static int reverse3(int n){
        if(n%10==n){
            return n;
        }

        int digits=(int)Math.log10(n)+1;

        return (n%10) * (int)(Math.pow(10,digits-1))+ reverse3(n/10);
    }

    public static int reverse4(int n, int sum){
        if(n==0){
            return sum;
        }

        int remainder = n%10;
        sum= sum*10 +remainder;

        return reverse4(n/10,sum);

    }
}
