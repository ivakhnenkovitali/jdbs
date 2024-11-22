package by._java_EE._6_thread._4_finishedInterrupt;

public class JThread extends Thread{
    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started.....\n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()) {
            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished.....\n", Thread.currentThread().getName());
    }



}
