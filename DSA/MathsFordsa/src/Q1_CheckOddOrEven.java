public class Q1_CheckOddOrEven {
    public static void main(String[] args) {

        System.out.println(isPrime(3));

    }

    public static boolean isPrime(int num){

        return (num & 1) ==0;
    }
}
