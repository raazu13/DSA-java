package R1_BasicRecurrancePattern;

public class Q8_noOf0s {
    public static void main(String[] args) {

        System.out.println(count(20234007,0));
    }

    public static int count(int n, int count){
        if(n==0){
            return count;
        }

        int remainder= n%10;
        if(remainder==0){
            return count(n/10, ++count);
        }else{
            return count(n/10,count);
        }
    }
}
