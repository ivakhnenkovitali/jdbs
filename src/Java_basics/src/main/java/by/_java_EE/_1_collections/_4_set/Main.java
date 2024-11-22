package by._java_EE._1_collections._4_set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(2);
        sortedSet.add(5);
        sortedSet.add(11);
        System.out.println(sortedSet); //[2, 5, 10, 11]
        SortedSet<Integer> tailSet = sortedSet.tailSet(3);
        System.out.println(tailSet); //[5, 10, 11]

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(15);
        navigableSet.add(12);
        navigableSet.add(9);
        navigableSet.add(2);
        navigableSet.add(16);
        System.out.println(navigableSet); //[2, 9, 12, 15, 16]
        System.out.println(navigableSet.floor(3)); // 2
        System.out.println(navigableSet.ceiling(3)); // 9
        System.out.println(navigableSet.lower(3));  // 2
        System.out.println(navigableSet.headSet(3)); // [2]
        System.out.println("-----------------");




    }
}
