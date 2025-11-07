package CustomArrayList;

public class Main {
    public static void main(String[] args) {

//        CustomArray arr = new CustomArray();
//        System.out.println(arr.isempty());
//        arr.add(12);
//        arr.add(14);
//        arr.add(13);
//        arr.set(2,15);
//        arr.display();
//        arr.remove();
//        arr.add(56);
//        arr.add(34);
//
//        arr.display();
//        System.out.println(arr.isempty());
//        System.out.println(arr.get(2));
//        System.out.println(arr.getSize());

        GenericArray<Integer> list = new GenericArray<>();
        list.add(10);
        list.add(20);
        list.add(23);
        list.display();
        System.out.println(list.get(2));
        list.set(2,43);
        list.display();

        GenericArray<String> list2= new GenericArray<>();

        list2.add("Raju");
        list2.add("Tv");
        list2.add("yubraj");
        list2.display();
    }
}
