package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list=new CLL();

        list.insertAtfirst(50);
        list.insertAtfirst(40);
        list.insertAtfirst(30);
        list.printList();
        list.insertAtEnd(34);
        list.insertAtEnd(90);
        list.printList();
    }
}
