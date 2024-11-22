package by._tests;

public class TestMyClass {
    public static void main (String args[]) {
        MyClass c1 = new MyClass();

        c1.firstMethod();
        c1.secondMethod();

        MyClass.firstMethod();
       // MyClass.secondMethod(); // не статик метод
    }
}
