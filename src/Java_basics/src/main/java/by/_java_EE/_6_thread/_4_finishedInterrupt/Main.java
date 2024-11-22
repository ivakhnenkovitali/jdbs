package by._java_EE._6_thread._4_finishedInterrupt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread t = new JThread("JThread");
        t.start();
        try {
            Thread.sleep(150);
            t.interrupt();
            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}
