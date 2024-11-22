package by._java_EE._4_stream._2_serializable;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    double height;
    boolean married;

    public Person() {
    }

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}
