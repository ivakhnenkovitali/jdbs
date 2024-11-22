package by._java_SE._7_class._1_blockCoda;

public class Person {
    static int staticVar;
    String name;
    int age;

    static {
        staticVar = 333;
        System.out.println("static " + staticVar);
    }

    {
        name = "Undefined";
        age = 18;
        System.out.println("no static");
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setStaticVar(int staticVar) {
        Person.staticVar = staticVar;
    }

    public void displayInfo() {
        System.out.println(" Name: " + name + " age: " + age);
    }
}
