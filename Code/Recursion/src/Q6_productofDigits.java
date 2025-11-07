public class Q6_productofDigits {
    public static void main(String[] args) {


        System.out.println(prod(1123));
    }
    public static int prod(int n){
        if(n==0){
            return 1;
        }

        return (n%10) * prod(n/10);
    }
}
