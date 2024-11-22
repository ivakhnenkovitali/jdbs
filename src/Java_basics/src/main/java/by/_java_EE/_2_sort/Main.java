package by._java_EE._2_sort;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom"));
        people.add(new Person("Masha"));
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println(people);

        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> people1 = new TreeSet<>(personComparator);
        people1.add(new Person("Vity"));
        people1.add(new Person("Vika"));
        System.out.println(people1);

    }
}
