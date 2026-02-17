 import java.util.Arrays;
 import java.util.Scanner;
public class arrayInput {
    public static void main(String[] args) {

        int[] arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        int[] arr1= {1,2,3,4,5};

        for(int num: arr1){
            System.out.print(num+" ");
        }


//        String[] str = new String[4];
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter the elements of String array:");
//
//        for (int i = 0; i < str.length-1 ; i++) {
//            str[i]= in.next();
//
//        }
//        in.close();
//        System.out.println("The array is :"+ Arrays.toString(str));

//        System.out.println(arr1[3]);

//        Scanner in=new Scanner(System.in);
//
//        System.out.println("Enter the elements of array");
//        for (int i = 0; i < arr1.length; i++) {
//            arr[i]=in.nextInt();
//
//        }
      /*or (int i = 0; i < arr1.length; i++) {


        System.out.print(arr1[i]+" ");

        }*/

//        for(int num : arr1){
//            System.out.print(num+" ");
//        }


//        in.close();

//        System.out.println(Arrays.toString(arr1));  //to string class of array
    }
}