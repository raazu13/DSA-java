public class countOccurence {

    public static void main(String[] args){

        int num = 767984797;
        int count = 0;


        while( num!=0){

           int remainder = num % 10;
           num = num / 10;

           if ( remainder == 7){
               count= count +1;
           }


        }

        System.out.println("The number of times 7 is occuring is :"+count);

    }
}
