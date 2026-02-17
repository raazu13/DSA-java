import java.util.Scanner;
import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();  // syntax for array list

        //Adding elemnts

//        arr.add(10);
//        arr.add(20);
//        arr.add(50);
//        arr.add(10);

        //printing the array list it can be printed without any loop or Arrays.toString(); class
//        System.out.println(arr);

        //removing elements

//        arr.remove(0);
//        System.out.println(arr);
//
//        //to replace the element
//
//        arr.set(1, 20);
//        System.out.println(arr);
//        arr.add(67);
//        arr.add(21);
//        System.out.println(arr);

        // to check if it contains particular elemnsts
//
//        System.out.println(arr.contains(21));
//        System.out.println(arr.contains(88));


       //  taking inputs using loops
        System.out.println("taking input:");
        Scanner in = new Scanner(System.in);
        // for loop taking inputs
        for(int i=0; i<5; i++){
            arr.add(in.nextInt());
        }

        in.close();

        System.out.println(arr);

        //to print individual elements

        for (int i = 0; i <5 ; i++) {
            System.out.print(arr.get(i)+" ");

        }




    }
}
