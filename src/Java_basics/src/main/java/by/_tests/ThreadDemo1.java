package by._tests;

public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i =0; i<3; i++){
            System.out.println("a ");
            System.out.println("b ");
        }
    }
}
