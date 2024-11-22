package by._java_EE._3_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("German");
        str.add("France");
        str.add("Italy");
        str.add("Spain");

        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(12);
        list.add(25);
        list.add(55);

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        listIterator.set(100);
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
