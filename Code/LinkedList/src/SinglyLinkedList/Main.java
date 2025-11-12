package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(40);
        list.insertAtEnd(70);

       LinkedList.Node n =  list.new Node(10);


        list.display();


    }
}
