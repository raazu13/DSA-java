package Stack;

public class Main {
    public static void main(String[] args) throws StackException {

//        CustomStack stack=new CustomStack();
//        stack.pop();
//        stack.push(10);
//        stack.push(23);
//        stack.push(56);
//        stack.push(90);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//
//        System.out.println(stack);
//        stack.display();

        CustomStack stack = new DynamicStack();

        stack.push(10);

        stack.push(10);
        stack.push(23);
        stack.push(56);
        stack.push(90);
        stack.push(10);
        stack.push(23);
        stack.push(56);
        stack.push(10);
        stack.push(23);
        stack.push(56);
        stack.push(90);
        stack.push(10);
        stack.push(23);
        stack.push(56);
        stack.push(90);
        stack.display();

    }
}
