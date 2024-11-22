package by._java_SE._3_variables;

public class Main_1 {
    public static void main(String[] args) {
        int H1 = 10;
        // int 1h=12; ошибка
        int _h1 = -5;
        int j_5 = 5;
        // int h = 2.5;  только целое если int
        // int р,о=3; , ошибка
        // int k j=2; пробел ошибка
        int NUMBER = 5; // нельзя по соглашению
        int Java = 5;   // нельзя Java - это ключевое слово!!

        System.out.println(Java);

        // float x= 4.5; ошибка
        float x1 = 25.5f;
        float x2 = -25f;
        float x3 = 25.5F;
        float x4 = 25F;
        float x5 = (float) 25.25;

        char y = '2';
        char y1 = 'k';
        char y3 = '_';
        // char y4 = "k"; ошибка
        // char y5 = k;  ошибка

        // char y7 = 65536;   ошибка до 65535 !!!!
        char y6 = 102;
        System.out.println(y6);  // f
        char y8 = '\u0066';
        System.out.println(y8); // f

        String text = "Hello\nword";
        System.out.println(text);

        String text_1 = "марина\n" +
                "ваня\n" +
                "лена";
        System.out.println(text_1);

        String text_2 = """
                Вася
                Вася
                Вася
                """;
        System.out.println(text_2);


        int c = 2147483647; // 2147483647 - это max значение int
        long c1 = 2147483647;
        // long c2 = 2147483648; ошибка превышает значение int
        long c3 = 2147483648l;
        long c4 = 2147483648L;

        int num111 = 0x6F; // 16 - теричная система = 111
        int num8 = 010;   // 8 - ричная система = 8
        int num13 = 0b1101;  // 2- ичная система = 13

        int m = 123_456;
        System.out.println(m); // 123456

        int m1 = 123_456_789;
        System.out.println(m1);  //123456789

        int a = 10;
        double b = 10.5;
        // int ab = a+b; ошибка
        double ab = a + b;
        System.out.println(ab);

        boolean l = false;
        boolean l1 = true;
        // boolean l3 = 1;

        int sum;
        // System.out.println(sum); ошибка

        int Sum = 50;

        //  const int SIZE = 5;
        final int SIZE;
        SIZE = 5;
        final int size = 5;

        double h = 20.5;
        int khgn = (int) 20.5 + 5;

        System.out.println(khgn);

        String j = null;
        //  String k = 0; ошибка

        System.out.println(Long.MAX_VALUE);

        double f = 10 / 3.0;
        System.out.println("f = " + f);

        int a22 = 3;
        int b22 = 7;
        System.out.println(a22 & b22);

        int number = 4;
        int key = 7;
        int encrypt = number ^ key;
        System.out.println(encrypt);

        int d = 2;
        System.out.println(~d);

        int g = 2;
        int p = 3;
        System.out.println(g << p);

        System.out.println(16 >> 1);
        System.out.println(5 >> 2);

        System.out.println(-8 >>> 2);
        System.out.println(16 >>> 2);

        //  System.out.println(-16<<<2);

        boolean vv = (5 > 6) | (2 > 0);
        System.out.println(vv);

        boolean nn = !(5==3);
        System.out.println(nn);


        boolean ff = (5<2) ^(5>3);
        System.out.println(ff);


    }
}
