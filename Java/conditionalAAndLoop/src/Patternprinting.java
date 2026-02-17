public class Patternprinting {


    public static void main(String[] args){

        //pattern printing of Square of stars
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        // triangle of stars (*)

        for (int i = 0; i<5; i++){
            for(int j=5; j>i; j-- ){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // to make triangle of 2 base and its power
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print((int)Math.pow(2,k));
            }
            for(int l=i-1; l>=0; l--){
                System.out.print((int)Math.pow(2,l));
            }
            System.out.println();
        }


        //box of star with gap in middle

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==0 || i==3 || j==0 || j==3){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }


        //pyramid of stars
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5-i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }


int num =1;
         //for continous number
        for (int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }


        for (int i = 1; i <=6 ; i++) {
            char ch='A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch+" ");
                ch++;

            }
            System.out.println();
        }


        //pascal triangle
        for (int i = 0; i <5; i++) {
            int n= 1;
            for (int j = 1; j <5-i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <=i; k++) {
                System.out.print(n+" ");
                n=n*(i-k)/(k+1);
                
            }
            System.out.println();

        }

        System.out.println();

        // Zig zag printing
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=9; j++) {

                if((i+j)%4==0 ||(i==2 && j%4==0) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

}
