package InBuiltPackage;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(0,90);
        System.out.println(list);
        System.out.println(list.get(0));
        list.addLast(20);
        System.out.println(list);
    }
}
