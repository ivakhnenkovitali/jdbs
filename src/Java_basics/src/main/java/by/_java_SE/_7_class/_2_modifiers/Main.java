package by._java_SE._7_class._2_modifiers;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Kate",32,"Baker Street","33-55-55");
        person.displayName();
        person.displayAge();
       //  person.displayAddress();  нет доступа private
        person.displayPhone();


        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address);
       // System.out.println(person.phone);  нет доступа private
        System.out.println(person.getPhone()); // только через get



    }
}
