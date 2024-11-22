package by._tests;

public class Dog extends Thread{

    Dog(){
        System.out.println("MyThear");
    }
    public void run() {
        System.out.println(" bar");
    }
    public void run(String s) {
        System.out.println(" baz");
    }
}
