//• Create a generic class Box<T> with methods add() and get().
//        • Create a generic method printArray(T[] arr).
//Practice with Box<Integer> and Box<String>.


package OOP_Bsics.Examples.Generics;

public class Main {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        printArray(arr);

        System.out.println();
        String[] str={"raju","kumar","kushwha"};
        printArray(str);
        System.out.println();

        Box<Integer> box=new Box();
        box.add(67);
        System.out.println(box.get());

        Box<String> str1=new Box();
        str1.add("Raju");
        System.out.println(str1.get());



    }

    public static <T> void printArray(T[] arr){
        for(T i:arr){
            System.out.print(i+" ");
        }
    }
}
