package by._java_EE._4_stream;

import java.io.ByteArrayInputStream;

public class Main_2 {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1,2,3,4,5};
        ByteArrayInputStream byteStream = new ByteArrayInputStream(arr);
        int b;
        while ((b=byteStream.read())!=-1){
            System.out.println(b);
        }

        String text ="Hello world";
        byte[] arr1 = text.getBytes();
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(arr1, 0 ,8);
        int c;
        while ((c=byteStream1.read())!=-1){
            System.out.println((char) c);
        }
    }
}
