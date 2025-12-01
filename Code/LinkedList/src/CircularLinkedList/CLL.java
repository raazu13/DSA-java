package CircularLinkedList;

public class CLL {

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    CLL(){
        this.head=null;
    }

    void insertAtfirst(int data){

        Node newNode=new Node(data);

        if(head==null){
           head=newNode;
           head.next=head;
            return;
        }

        Node temp =head;

        while(temp.next!=head){
            temp=temp.next;
        }


        temp.next=newNode;
        newNode.next=head;
        head=newNode;

    }

    void printList() {
        if (head == null) {
            System.out.println("the linkedlist is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("back to head");
    }


    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
            return;
        }

        Node temp =head;

        while(temp.next!=head){
            temp=temp.next;
        }


        temp.next=newNode;
        newNode.next=head;

    }

    void insertAt(int index, int data){
       if(index<0){
           System.out.println("invalid index");
           return;
       }
        if(index==0){
            insertAtfirst(data);
            return;
        }

        if (head==null){
            System.out.println("index out of bound");
            return;
        }

        Node temp= head;
        for(int i=0; i<index-1; i++){

            temp=temp.next;

            if(temp==head){
                System.out.println("index out of bound");
                return;
            }
        }
        Node newNode =new Node(data);

        newNode.next=temp.next;
        temp.next=newNode;


    }

    void deletAtFirst(){

        if(head==null){
            System.out.println("empty list");
            return;
        }
       if(head.next==head){
           head=null;
           return;
       }

        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }

        temp.next=head.next;
        head=head.next;

    }

    void deletAtEnd(){
        if(head==null){
            System.out.println("empty list");
            return;
        }

        if(head.next==head){
            deletAtFirst();
            return;
        }

        Node temp = head;
        while(temp.next.next!=head){
            temp=temp.next;
        }

        temp.next=head;

    }

    Node delete(int key){

        if(head==null){
            System.out.println("empty list");
            return null;
        }

        if (head.next == head) {
            if (head.data == key) {
                Node removed = head;
                head = null;
                return removed;
            } else {
                System.out.println("key not found");
                return null;
            }
        }

        if (head.data == key) {
            // delete head using deleteFirst logic
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            Node removed = head;
            head = head.next;
            last.next = head;
            return removed;
        }

        Node temp=head;
        while (temp.next != head && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("the key is not in list");
            return null;
        }

        Node value= temp.next;
        temp.next=temp.next.next;
        return value;


    }
}
