package by._tests;

public class Test_2 {
    public static void main(String[] args) {
        long a = 100l;
        double b = 300.0;
        Object ab = a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab);

        double c = 1000.05;
        long d = 1000;
        Object cd = c+d;
        System.out.println(cd.getClass().getName() +" value: " + cd);

        int a0 = 64;
        int a1 = 257;
        int a2 = 126;
        int a3 = 129;
        byte b0 = (byte) a0;
        byte b1 = (byte) a1;
        byte b2 = (byte) a2;
        byte b3 = (byte) a3;
        System.out.println(b0+ " " + b1 + " " + b2 + " " + b3); //64 1 126 -127


       int [][] arr= {{1,2,3,4},{1,2,3,5}};
        System.out.println(arr[1].length);




    }
}
