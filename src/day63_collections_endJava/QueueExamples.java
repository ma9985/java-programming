package day63_collections_endJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
