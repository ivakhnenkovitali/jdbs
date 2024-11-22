package by._java_SE._8_interfaces;

public class Journal implements Printable {
    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public void print_1() {
        System.out.println("Yes");;
    }
}
