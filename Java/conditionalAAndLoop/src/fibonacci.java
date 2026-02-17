public class fibonacci {
    public static void  main(String [] args){

        int a=0;
        int b= 1;

        int count = 2;

        System.out.print(0+" ");

        while(count <=10){
            System.out.print(b+" ");
            int temp = b;
            b = a+b;
            a = temp;

            count++;
        }




    }

}
