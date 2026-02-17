package Stack;

public class StackArray {


        int [] arr;
        int capacity;
        int top=-1;

        StackArray(int size){
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
            if(top==-1){
                return true;

            }
            return false;
        }
}
