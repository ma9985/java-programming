package day62_collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("MA");//0
        states.add("VA");//1
        states.add("IL");//2
        states.add("CA");//3
        states.add("TX");//4

        System.out.println(states);
        System.out.println(states.get(3));
    }
}
