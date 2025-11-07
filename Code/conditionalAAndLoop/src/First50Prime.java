public class First50Prime {
    public static void main(String[] args) {

        int count=0;

        int num=2;


        while(count<50){
            boolean isPrime=true;

            for (int i =2; i*i <=num; i++) {
                if(num%i==0){
                    isPrime=false;
                    break;
                }

            }

            if(isPrime) {
                System.out.printf("%5d", +num);
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            num++;
        }
    }
}
