package Stack;

public class StackLL {

        private static class Node{
            int data;
            Node next;
            Node(int x){
                this.data=x;
                this.next=null;
            }

            Node(int x, Node y){
                this.data=x;
                this.next=y;
            }
        }

       private Node top;

        void push(int data){
            Node newnode=new Node(data);
            newnode.next=top;
            top=newnode;
        }

        int pop(){
            if(top==null){
                System.out.println("Stack is empty");
                return -1;
            }

            int value=top.data;
            top=top.next;
            return value;
        }

        int peek(){
            if(top==null){
                System.out.println("Stack is empty");
                return -1;
            }

            int value=top.data;
            return value;
        }

        boolean isempty(){
            return top==null;
        }
    }

