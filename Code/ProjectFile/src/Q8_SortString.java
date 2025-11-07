import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q8_SortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        sc.close();

        char[] arr=str.toCharArray();

        Arrays.sort(arr);

        str= new String(arr);

        System.out.println(str);

        CountVowelConsonent(str);


    }

    public static void CountVowelConsonent(String s){

        s=s.toLowerCase();
        int n= s.length();
        int vowels=0;
        int cons=0;

        for (int i = 0; i <n ; i++) {
            char ch= s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                cons++;
            }

        }

        System.out.println("The number of vowels: "+vowels);
        System.out.println("The number of Consonent: "+cons);

    }
}
