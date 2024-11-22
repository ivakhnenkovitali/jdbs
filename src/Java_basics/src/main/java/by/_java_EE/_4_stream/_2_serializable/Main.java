package by._java_EE._4_stream._2_serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
            Person person = new Person("Tom",33,178,true);
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/by/_java_EE/_4_stream/_2_serializable/person.txt"))){
            Person person = (Person) ois.readObject();
            System.out.printf("Name: %s\t Age: %d \n",person.getName(),person.getAge());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
