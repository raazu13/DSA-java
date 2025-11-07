public class Q6_PatternPrinting {
    public static void main(String[] args) {
        
        //a
        for (int i = 0; i <4 ; i++) {
            int n=1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(n);
                n++;

            }
            System.out.println();
            
        }

        System.out.println();
         //b
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println();

        //c
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
