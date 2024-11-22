package by._java_SE._8_interfaces;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Shildt");
        book1.print();

        // Printable printable = new Printable();
        Printable printable = new Book("C++", "Books");
        printable.print(); //C++ (Books)

        Printable printable1 = new Journal("HPH");
        printable1.print(); //HPH
        var nameJournal = ((Journal) printable1).getName();
        System.out.println(nameJournal);

        Journal journal = new Journal("JavaScript");
        var nameJournal1 = journal.getName();
        System.out.println(nameJournal1);
        journal.print_1();

        Printable.read(new Book("Java", "hjhk"));


        Calculatable calculatable = new Calculation();
        System.out.println(calculatable.sum(1,2));
        System.out.println(calculatable.sum(1,2,4));


        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);





    }
}
