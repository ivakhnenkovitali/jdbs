package by._java_EE._1_collections._2_list;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(20);
        System.out.println(list2);
        System.out.println(list2.size());

        System.out.println("-------------");
        Vector<Integer> vector = new Vector<>(list1);
        System.out.println(vector);
        vector.addElement(25);
        System.out.println(vector);
        System.out.println(vector.lastElement());

        Stack<Integer> stack=new Stack<>();
        stack.add(66);
        stack.add(77);
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());


    }
}
