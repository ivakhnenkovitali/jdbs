package by._java_EE._1_collections._1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collection <Integer> collection = new ArrayList<>();
        collection.addAll(list);
        System.out.println(list);
        System.out.println(collection);

        System.out.println(collection.contains(2));
        System.out.println(collection.containsAll(list));
        list.add(5);
        System.out.println(collection.containsAll(list));

       // System.out.println(list.removeAll(collection));
        System.out.println(list.retainAll(collection));
        System.out.println(collection);
        System.out.println(list);

        Object[] objects = collection.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }



    }


}
