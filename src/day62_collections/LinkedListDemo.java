package day62_collections;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        //polymorphism
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(10);
        scores.add(55);
        scores.add(65);
        System.out.println(scores);
        System.out.println("" + scores.get(0));
    }
}
