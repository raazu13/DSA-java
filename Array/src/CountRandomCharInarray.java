import java.util.Arrays;

public class CountRandomCharInarray {
    public static void main(String[] args) {

        char[] random=createArr();

        display(random);

        int [] c=count(random);

        System.out.println(Arrays.toString(c));

    }
    public static char[] createArr(){

        char[] arr= new char[100];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(char)((Math.random()*('z'-'a'+1))+'a');

        }
        return arr;
    }

    public static void display(char[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static int[] count(char[] arr){
        int[] countArray=new int[26];

        for (int i = 0; i <arr.length; i++) {
            countArray[arr[i]-'a']++;

        }
        return countArray;
    }
}
