package by._tests;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i =0; i<3; i++){
            System.out.println("c ");
            System.out.println("d ");
        }
    }
}
