package LambdaFun;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Lambda l= ()-> System.out.println("Hellow");
//
//        l.sum();

        Lambda l= (a,b)->a+b;

        System.out.println( l.sum(1,2));


        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(12);
        arr.add(54);
        arr.add(65);
        arr.add(78);

        arr.forEach(b-> System.out.println(b));
    }
}
