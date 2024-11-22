package by._java_SE._7_class._1_blockCoda;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfo();

        Person person1 = new Person("Tom");
        person1.displayInfo();

        Person person2 =new Person(25);
        person2.displayInfo();

        Person person3 = new Person("Masha", 30);
        person3.displayInfo();

        out.println("WOW");
        out.println(Person.staticVar); // обращение к static полю
        Person.setStaticVar(1000);
        out.println(Person.staticVar); // обращение к static полю

    }
}
