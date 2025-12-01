package SinglyLinkedList;

public class LL {
    Node head;
    Node tail;
    int size;

    LL(){
        this.size=0;
    }

    void insertFirst(int data){

        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    void insertEnd(int data){

        Node newNode= new Node(data);

        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }

        tail.next=newNode;
        tail=newNode;
        size++;
    }

    void insert(int index, int data){

        if(index<0 || index>size){
            System.out.println("Index out of bound");
            return;
        }

        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertEnd(data);
            return;
        }

        Node temp= head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }

        Node newNode= new Node(data,temp.next);
        temp.next=newNode;
        size++;
    }

    public int deleteFirst(){

            if (head == null) {
                System.out.println("linked list is empty");
                return -1;
            }
            int val = head.data;
            if(head==tail) {
               head = tail = null;
               size--;
             return val;
           }

        head = head.next;
        size--;
        return val;

        }

   public int deletLast(){

        if(tail==null){
            System.out.println("the list is empty");
            return -1;
        }

        if(head==tail){
            return deleteFirst();
        }

        int i=0;
        Node temp= head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

        int val= temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
   }

   public int delete(int index){

       if(index<0 || index>=size){
           System.out.println("Index out of bound");
           return -1;
       }
        if(tail==null){
            System.out.println("empty list");
            return -1;
        }
        if(index==0){
            return deleteFirst();
        }


        if(index==size-1){
            return deletLast();
        }

        Node temp= head;

        int i =1;
        while(i<index){
            temp=temp.next;
            i++;
        }

        int val= temp.next.data;

        temp.next=temp.next.next;
        size--;

        return val;
   }


   public Node get(int data){

        Node temp=head;

        while(temp!=null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }

        return null;
   }

   public  int indexof(int data){

        Node temp = head;

        int index =0;

        while(temp!=null){
            if(temp.data==data){
                return index;
            }
            temp=temp.next;
            index++;

        }

        return -1;
   }




    void display(){

        Node temp=head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }




    public class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }
}
