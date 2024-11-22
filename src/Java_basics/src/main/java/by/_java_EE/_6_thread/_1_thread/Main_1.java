package by._java_EE._6_thread._1_thread;

import by._java_EE._6_thread._1_thread.JThread;

public class Main_1 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        for (int i = 1; i < 6; i++) {
            new JThread("Thread " + i).start();
        }
        System.out.println("Main thread finished...");


    }
}
