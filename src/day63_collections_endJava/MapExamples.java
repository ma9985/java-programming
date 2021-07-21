package day63_collections_endJava;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        //is, names
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tariq");
        map.put(2, "Mohammad");
        map.put(2, "Karim");
        map.put(100, "teezy");
        System.out.println(map.get(100));
        System.out.println(map);
        System.out.println(map.get(50));

        System.out.println(map.remove(1));
        System.out.println(map);
        map.put(1,"Jinan");
        System.out.println(map);
        map.remove("Idris");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Tariq"));

        for(Integer key :map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        //map.values
    }
}
