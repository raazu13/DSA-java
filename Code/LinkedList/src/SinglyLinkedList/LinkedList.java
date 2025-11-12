package SinglyLinkedList;

public class LinkedList {

    private Node head;
    private  Node tail;
    int size;

    LinkedList(){
        size=0;
    }

    void insertAtFirst(int data){
        Node newNode= new Node(data);

        newNode.next=head;
        head=newNode;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    void insertAtEnd(int data){
        Node newNode= new Node(data);

        if(tail==null){
            head=newNode;
            tail=newNode;
        }else {

            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    


    void display(){
        Node temp= head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp= temp.next;
        }
        System.out.println("Null");
    }



    public class Node{

        private int data;
        private Node next;

        Node(int data){
            this.data=data;

        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }


 }



