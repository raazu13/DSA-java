package Queue.InbuiltImplementation;

public class QueueArray {

    private int[] arr;
    private int capacity,size,front,rear;

    QueueArray() {
        this(10);
    }

    QueueArray(int s){
        this.capacity=s;
        this.arr= new int[this.capacity];

        this.size=0;
        this.front=0;
        this.rear=-1;
    }

     boolean isFull(){

        return size==capacity;
     }

     boolean isEmpty(){
        return  size==0;
     }

     void enqueue(int x){
        if(isFull()){
            System.out.println("Queue full");
            return;
        }

        this.rear=(rear+1)%capacity;
        this.arr[rear]=x;
        size++;

     }

     int dequeue(){
        if(isEmpty()){
            return -1;
        }

        int x= this.arr[front];
        this.front=(front+1)%capacity;
        size--;
        return x;

     }

     int peek(){
        if(isEmpty()){
            return -1;
        }

         int x= this.arr[front];

         return x;
     }



}
