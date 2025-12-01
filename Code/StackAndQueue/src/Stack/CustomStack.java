package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=-1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int data) throws StackException{
        if(isFull()){
            throw new StackException("The stack is full you cant push..");
        }
        ptr++;
        this.data[ptr]=data;

        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("The stack is empty, cant pop");
        }

        return this.data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("The stack is empty cant peek..");
        }

        return this.data[ptr];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }
        for(int i: this.data){
            System.out.print(i+" ");
        }
    }

    public boolean isEmpty(){
         return ptr== -1;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }
}
