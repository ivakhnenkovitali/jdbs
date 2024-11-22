package by._java_EE._6_thread._1_thread;

import by._java_EE._6_thread._1_thread.JThread;

public class Main_2 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread t = new JThread("JThread ");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished...");

    }
}
