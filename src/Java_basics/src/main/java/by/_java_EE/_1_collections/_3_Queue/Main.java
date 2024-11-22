package by._java_EE._1_collections._3_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(22);
        deque.addFirst(11);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);



    }
}
