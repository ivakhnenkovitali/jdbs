package by._java_SE._3_variables.transformation;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        //  byte b = a; ошибка  int-4 байта byte-1 байт
        byte c = 4;
        byte b = (byte) a;

        byte d = 7;
        int i = d;

        char c1 = 12;
        int b1 = c1;


        char c2 = 'a';
        int v = c2;
        System.out.println("char " + v);

        short x = 25;
        float x1 = x;
        System.out.println(x1);

        int m = 2147483647;
        float m1 = m;
        System.out.println(m1); // потеря информации

        double z = 56.88569;
        int z1 = (int) Math.round(z);
        System.out.println(z1);

        int n = 3;
        double n1 = 4.6;
        System.out.println(n + n1);


    }
}
