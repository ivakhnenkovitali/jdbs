package by._java_SE._10_object;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Tom", 25);
        System.out.println(student.getClass());
        System.out.println("Main.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);

        System.out.println("--------------------");
        int [] arr = {1,2,3};
        System.out.println(arr);    //[I@2d98a335
        System.out.println(Arrays.toString(arr));  //[1, 2, 3]

        String f = "Hello";
        System.out.println(f);   //Hello

        Student student2 = new Student("Tom", 25);
        System.out.println(student2);   // Student[name='Tom', age=25]

        System.out.println(student2.getClass());

        if(student2.getClass()==Student.class){
            System.out.println("yes");
        }
        if(student2 instanceof Student) {
            System.out.println("Of course");
        }

        System.out.println("----------------");
        System.out.println("A");
        System.out.println("A".hashCode());
        System.out.println(student.hashCode());

        System.out.println("-------------------");
        Student st3 = new Student("Ivan",25);
        Student st4 = new Student("Ivan",25);
        System.out.println(st3==st4);  //  false  сравнили ссылки
        System.out.println(st3.equals(st4));  // true - только если переопределить метод!!!!


        student1.hhhh();
        Student.hhhh(5);


    }
}
