package by._java_EE._4_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello Alican!";

        try(FileOutputStream fos = new FileOutputStream("src/main/java/by/_java_EE/_4_stream/notes.txt")) {
            byte[] buffer = text.getBytes();
            fos.write(buffer,0, buffer.length);
           // fos.write(buffer[0]);
            System.out.println("The file has been written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fin = new FileInputStream("src/main/java/by/_java_EE/_4_stream/notes.txt")){
            int i ;
            while ((i=fin.read())!=-1){
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       try (FileInputStream fin1 = new FileInputStream("src/main/java/by/_java_EE/_4_stream/notes.txt")){
           byte[] buffer1 = new byte[256];
           System.out.println("File data");
           int count ;
           while ((count=fin1.read(buffer1))!=-1){
               for (int i=0; i<count; i++){
                   System.out.println((char)buffer1[i]);
               }
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
