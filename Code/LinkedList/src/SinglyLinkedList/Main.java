package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList list = new LinkedList();
//
//        list.insertAtFirst(10);
//        list.insertAtFirst(20);
//        list.insertAtFirst(40);
//        list.insertAtEnd(70);
//        list.insertAtEnd(23);
//        list.display();
//
//        list.insertAt(1,99);
//        list.insertAt(0,0);
//
//        list.display();

        LL list=new LL();
        list.insertFirst(23);
        list.insertFirst(12);
        list.insertFirst(90);
        list.insertFirst(89);
        list.display();

        list.insertEnd(34);
        list.insertEnd(50);
        list.insertEnd(13);
        list.display();

        list.insert(1,10);
        list.insert(0,0);
        list.insert(9,9);
        list.display();

        list.deleteFirst();
        list.deletLast();
        list.delete(1);
        list.display();

        System.out.println(list.get(90).toString());
        System.out.println(list.indexof(90));






    }
}
