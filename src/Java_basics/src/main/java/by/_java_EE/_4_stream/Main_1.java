package by._java_EE._4_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main_1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("src/main/java/by/_java_EE/_4_stream/notes.txt");
            FileOutputStream fos = new FileOutputStream("src/main/java/by/_java_EE/_4_stream/notes_new.txt")){
            byte[] buffer = new byte[256];
            int count;
            while ((count=fin.read(buffer))!=-1){
                fos.write(buffer, 0 , count);
            }
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
