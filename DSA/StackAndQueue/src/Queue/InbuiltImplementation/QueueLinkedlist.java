package Queue.InbuiltImplementation;

public class QueueLinkedlist {

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node rear;
    private  Node front;
    private int size;

    QueueLinkedlist(){
        this.rear=null;
        this.front=null;
        this.size=0;
    }

    boolean isempty(){
        return size==0;
    }

    void enqueue(int data){
         Node newnode = new Node(data);

         if(isempty()){
             front=rear=newnode;
             size++;
             return;
         }

         rear.next=newnode;
         rear=newnode;
         size++;

    }

    int dequeue(){
        if(isempty()){
            return -1;
        }

        int x= front.data;
        front=front.next;
        size--;

        if(front==null){
            rear=null;
        }

        return x;
    }

    int peek(){
        if(isempty()){
            return -1;
        }

        return front.data;
    }

    int getSize(){
        return size;
    }
}
