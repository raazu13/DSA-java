public class SumofNum {
    public static void main(String[] args) {

        System.out.println(sum(1, 100));
        System.out.println(sum(10, 20));
        System.out.println(sum(1000, 10000));
        int sum = sum(1, 100);

        double max = Math.max(10, 20);

        System.out.println();

        print(2, 2);
        print(3, 5);

        int ma=max(10,20);
//        System.out.println(ma);
//
//        System.out.println(max(20,30));
//

        String name = name("tv bsdk");
        System.out.println(name);


    }

    static int sum(int start, int end) {

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;

        }

        return sum;

    }

    public static void print(int a, int b) {
        System.out.println(a + b);
    }

    public static int max(int a, int b) {

        int c= (a>b)? a:b;

        System.out.println(c);
        return c;
    }


    public static String name(String a){

        return "hi "+a;
    }
}