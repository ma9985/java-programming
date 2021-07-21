package day63_collections_endJava;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("jamie");
        list.add("jack");
        System.out.println(list);

        Iterator<String> it = list.iterator();

        it.next();
        it.remove();
        System.out.println(list);
    }
}
