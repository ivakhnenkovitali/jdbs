package by._java_SE._5_arrays;

import java.util.StringJoiner;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
