package by._java_SE._3_variables;

public class Main_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = a + b;
        int d = 4 + b;
        System.out.println(c); // 17
        System.out.println(d);  // 11

        c = a - b;
        d = 4 - a;
        System.out.println(c);  // 3
        System.out.println(d);  // -6

        c = a * b;
        d = b * 5;
        System.out.println(c);  // 70
        System.out.println(d);  // 35

        int a1 = 20;
        int b1 = 5;
        int c1 = a1 / b1;
        double d1 = 22.5 / 4.5;
        System.out.println(c1); // 4
        System.out.println(d1);  // 5.0

        double d2 = 10 / 4;
        System.out.println(d2);  // 2.0 !!!!!!
        double d3 = 10.0 / 4;
        System.out.println(d3);  // 2.5 !!!!!!

        int t1 = 33;
        int t2 = 5;
        int tt = t1 % t2;
        int ttt = 22 % 4;
        System.out.println(tt);  // остаток от деления 3
        System.out.println(ttt);  // остаток от деления 2 (22-4*5=2)

        int k = 8;
        int m = ++k;
        System.out.println(k); // 9
        System.out.println(m);  // 9

        int k1 = 8;
        int m1 = k1++;
        System.out.println(k1); // 9
        System.out.println(m1);  // 8

        int k2 = 8;
        int m2 = --k2;
        System.out.println(k2); // 7
        System.out.println(m2);  // 7

        int k3 = 8;
        int m3 = k3--;
        System.out.println(k3); // 7
        System.out.println(m3);  // 8


        int s = 8;
        int p = 7;
        int sp = s + 5 * ++p;
        System.out.println(sp); // 48

        int s1 = 8;
        int p1 = 7;
        int sp1 = (s1 + 5) * ++p1;
        System.out.println(sp1); // 104

        int h = 10 / 5 * 2;
        System.out.println(h);  // 4

        double h1 = 2.0 - 1.1;
        System.out.println(h1); // 0.8999999999999

        int f1 = 2; // 010
        int f2 = 5;  // 101
        System.out.println(f1&f2); //  0

        int f3 = 4;  // 100
        int f4 = 5;  // 101
        System.out.println(f3&f4); // 4

        System.out.println(f1|f2);  // 7 - 111
        System.out.println(f3|f4);  // 5 - 101

        int number = 45; //101101
        int key = 102; //1100110
        int encrypt = number^key;
        System.out.println(encrypt);  // или 1001011 или  75
        int decrypt = encrypt^key;
        System.out.println(decrypt);  // 45

        byte v = 12; // 0000 1100
        System.out.println(~v); // или 11110011 или -13


        int w = 4;  // 100
        int ww = w<<1;
        System.out.println(ww); // 1000 = 8

        int w1 = 16; // 10 000
        int ww1 = w1>>1;
        System.out.println(ww1);  // 1000 = 8

        int w2 = -8; // 10 000
        int ww2 = w2>>>2;
        System.out.println(ww2);  // 1073741822



    }
}
