package by._tests;

public class ThreadDemo2 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        ThreadDemo threadDemo =new ThreadDemo();

        threadDemo1.start();
        threadDemo.start();
    }
}
