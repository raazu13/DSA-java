package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DLL list=new DLL();

        list.printForward();
//        list.deletAtFirst();
//        list.insertAt(10,90);
        list.deletAt(1);

        list.insertAtFirst(10);
        list.insertAtFirst(5);
        list.insertAtFirst(2);
        list.inserAtEnd(20);
        list.inserAtEnd(30);
        list.insertAt(0,0);
        list.insertAt(6,40);
        list.insertAt(2,3);
        list.deletAtFirst();
        list.deletAtEnd();
        list.deletAt(1);
//        list.deletAt(10);
        list.printForward();
        list.printBackward();

    }
}
