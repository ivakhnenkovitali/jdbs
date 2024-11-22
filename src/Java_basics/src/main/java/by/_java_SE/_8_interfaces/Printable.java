package by._java_SE._8_interfaces;

public interface Printable {
    void print();

    default void print_1() {
        System.out.println("Undefined printable");
    }

    static void read(Book book) {
        System.out.println("Read printable");
    }

}
