package DoublyLinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    DLL(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void printForward(){

        Node temp=head;

        System.out.print("null <->");
        while(temp !=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }

        System.out.println("null");
    }

    void printBackward(){

        Node temp=tail;
        System.out.print("null <->");
        while(temp !=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;
        }

        System.out.println("null");
    }

    void insertAtFirst(int data){

        Node newNode= new Node(data);

        if(isEmpty()){
            head=tail=newNode;
            size++;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            size++;
        }

    }

    void inserAtEnd(int data){

        if(isEmpty()){
            insertAtFirst(data);
            return;
        }

        Node newNode= new Node(data);

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
    }
     void insertAt(int index , int data){

        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bound ");
        }

        if(index==0){
            insertAtFirst(data);
            return;
        }

        if(index==size){
            inserAtEnd(data);
            return;
        }

        Node newNode=new Node(data);

        Node temp=head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }


        newNode.prev=temp;
        newNode.next=temp.next;

         temp.next.prev=newNode;
         temp.next=newNode;
         size++;

     }

     void deletAtFirst(){
        if(isEmpty()){
            System.out.println("the list is empty");
            return;
        }

        if(head==tail){
            head=tail=null;
            size--;
            return;
        }

        head=head.next;
        head.prev=null;
        size--;
     }

     void deletAtEnd(){
         if(isEmpty()){
             System.out.println("the list is empty");
             return;
         }

         if(head==tail){
             head=tail=null;
             size--;
             return;
         }

         tail=tail.prev;
         tail.next=null;
         size--;
     }

     void deletAt(int index){

         if(index<0 || index>=size){
             throw new IndexOutOfBoundsException("Index out of bound ");
         }

         if(index==0){
             deletAtFirst();
             return;
         }

         if(index==size-1){
             deletAtEnd();
             return;
         }

         Node temp= head;

         for (int i=0; i<index; i++){
             temp=temp.next;
         }

         temp.next.prev=temp.prev;
         temp.prev.next=temp.next;
         size--;


     }



    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.prev=null;
            this.next=null;
            this.data=data;
        }
    }
}
