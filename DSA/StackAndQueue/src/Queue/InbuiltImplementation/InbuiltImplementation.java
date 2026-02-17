package Queue.InbuiltImplementation;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class InbuiltImplementation {

    public static void main(String[] args) {
//        Queue<Integer> q= new LinkedList<>();
//        System.out.println(q.isEmpty());
//        q.offer(10);
//        q.offer(29);
//        System.out.println(q.element());
//        System.out.println(q);
//        q.poll();
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());

        Queue<Integer> q= new ArrayDeque<>();

        q.offer(10);
        q.add(30);
        System.out.println(q.poll());


    }
}
