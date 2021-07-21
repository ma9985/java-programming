package day63_collections_endJava;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(100);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("Hello");
        words.add("Mohammad");
        words.add("Idris");
        words.add("Idris");
        words.add("I love to code");
        System.out.println(words);

        for (String String : words) {

        }

        //convert ur set to a list

        List<String> wordlist = new ArrayList<>();
        wordlist.add("world");
        System.out.println(wordlist);

        //LinkedHashSet

        Set<String> linkedHasSet = new LinkedHashSet<>();
        linkedHasSet.add("24");
        linkedHasSet.add("java");
        linkedHasSet.add("@#%&");
        linkedHasSet.add("53");
        linkedHasSet.add("53");
        linkedHasSet.add("apple");
        linkedHasSet.add("cucumber");
        System.out.println(linkedHasSet);

        //TreeSet

        Set<String> linkedHasSet2 = new TreeSet<>();
        linkedHasSet2.add("24");
        linkedHasSet2.add("java");
        linkedHasSet2.add("@#%&");
        linkedHasSet2.add("53");
        linkedHasSet2.add("53");
        linkedHasSet2.add("apple");
        linkedHasSet2.add("cucumber");
        System.out.println(linkedHasSet2);
    }

}