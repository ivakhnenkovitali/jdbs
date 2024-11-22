package by._java_EE._4_stream._1_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        String text = "Hello";
        try (FileOutputStream fos = new FileOutputStream("src/main/java/by/_java_EE/_4_stream/_1_printStream/notes_print.txt");
             PrintStream printStream = new PrintStream(fos)){
            printStream.println(text);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
