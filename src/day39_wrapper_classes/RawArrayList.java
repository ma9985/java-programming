package day39_wrapper_classes;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare raw arraylist
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList(); // this way is more popular and flexible


        // add values
        list1.add("java");
        list1.add("teezy");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1); //[java, teezy, coffee, 1234, 55.2, true, wooden spoon]
        System.out.println(list1.size());  //7
    }
}