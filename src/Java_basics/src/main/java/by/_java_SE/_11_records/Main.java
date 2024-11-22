package by._java_SE._11_records;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Tom", 25);
        System.out.println(person.toString());
        System.out.println(person.name());
    }
}
