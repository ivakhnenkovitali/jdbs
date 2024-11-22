package by._tests;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog(){
            public void run() {
                System.out.println(" foo");
            }
        };
        dog.start();

    }
}
