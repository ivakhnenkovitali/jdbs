package by._java_EE._6_thread._3_finisedRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread myThread =new MyThread();
        new Thread(myThread,"MyThread").start();  //1
        try {
            Thread.sleep(1100);  // останавливаем
            myThread.disable();   // сброс состояния
            Thread.sleep(1000);  // остановка
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}
