package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class InbuiltJavaImplementation {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//
//        stack.push(19);
//
//        stack.push(20);
//        stack.push(33);
//        stack.pop();
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.isEmpty());

        Deque<Integer> stack = new ArrayDeque<>();

        stack.add(10);
        stack.push(20);
        stack.push(45);
        System.out.println(stack);
        System.out.println(stack.pop());




    }
}
