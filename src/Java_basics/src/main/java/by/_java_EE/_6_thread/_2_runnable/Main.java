package by._java_EE._6_thread._2_runnable;

import by._java_EE._6_thread._1_thread.JThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread myThread =new Thread(new MyThread(),"MyThread");
        myThread.start();
        System.out.println("Main thread finished...");

    }
}
