package Stack;

public class CustomStack {
    public class stackArray{

       private int [] arr;
      private  int capacity;
       private int top=-1;

        stackArray(int size){
            this.capacity=size;
            this.arr=new int[this.capacity];
        }

        void push(int x){
            if(top==capacity-1){
                System.out.println("Stack over flow");
                return;
            }

            arr[++top]=x;
        }

        int pop(){
            if(top==-1){
                System.out.println("Stack is empty cant pop");
                return -1;
            }

            return arr[top--];
        }

        boolean isempty(){
             return top==-1;
        }
    }


}
