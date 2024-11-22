package by._java_EE._6_thread._2_runnable;

public class Main_1 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Runnable r = ()->{
            System.out.printf("%s started.....\n", Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s fished...\n",Thread.currentThread().getName());
            System.out.printf("%s jjjj\n", Thread.currentThread().getName());
        };
        Thread myThread = new Thread(r,"MyThread");
        myThread.start();
        System.out.println("Main thread finished...");
    }
}
