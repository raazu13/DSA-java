package ComparingObject;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


    Student raju = new Student(1,98);
    Student tv= new Student(12,89);
    Student aniket = new Student(23,80);

    Student [] arr={raju,tv,aniket};

    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(raju.compareTo(tv));


        if(raju.compareTo(tv)<0){
            System.out.println("Tv have more marks");
        }else if(raju.compareTo(tv)==0){
            System.out.println("both have equal marks");
        }else{
            System.out.println("Raju have more marks");
        }

}
}