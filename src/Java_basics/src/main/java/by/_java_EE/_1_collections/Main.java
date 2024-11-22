package by._java_EE._1_collections;

import by._java_SE._7_class._1_blockCoda.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        List<String> list = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> queue1 = new PriorityQueue<>();


        System.out.println("------------------");
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "Class");
        System.out.println(map);    // {1=Class}
        var value = map.put(1, "Web");
        System.out.println(value);   //Class
        System.out.println(map);     // {1=Web}

        System.out.println("------------------");
        Hashtable<Integer, String> map1 = new Hashtable<>();
        map1.put(1, "Class");
        System.out.println(map1);    // {1=Class}
        var value1 = map1.putIfAbsent(1, "Web");
        System.out.println(value1);  //Class
        System.out.println(map1);    //{1=Class}

        System.out.println("------------------");
        Hashtable<Integer, List<Person>> map2 = new Hashtable<>();

        System.out.println("---------------");
        map1.put(2, "Java");
        map1.put(3, "C++");
        Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
        System.out.println(entrySet);  //[3=C++, 2=Java, 1=Class]

        for (Map.Entry<Integer, String> elem : entrySet) {
            Integer key = elem.getKey();
            String value3 = elem.getValue();
            System.out.println("key " + key + "value " + value3);
        }
        // key 3value C++
        //key 2value Java
        //key 1value Class




    }
}
