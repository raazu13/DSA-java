package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericArrays<Integer> arr= new GenericArrays<>();
      arr.add(23);
      arr.add(78);
      arr.add(34);
      arr.display();
      arr.remove();
              arr.set(0,100);
              arr.remove(0);
              arr.display();


              GenericArrays<String> str= new GenericArrays<>();
              str.add("raju");
              str.add("tv");
              str.add("motka");
              str.add("madharchod");
              str.display();

              printList(str);


        Integer[] a={1,2,3,4,5};
        print(a);

        String[] s= {"Raju ","kushwaha"};
        print(s);
    }

    public static void printList(GenericArrays<?> list){
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i));
        }
    }

    public static <T> void print(T[] arr){
        for(Object obj:arr){
            System.out.println(obj);
        }
    }
}
