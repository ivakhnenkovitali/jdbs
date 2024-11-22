package by._java_EE._7_stream;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] x = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count1 = 0;

        for (int i : x) {
            if (i > 0) {
                count1++;
            }
        }
        System.out.println(count1);

        long count2 = IntStream.of( -4, -3, -2, -1, 0, 1, 2, 3, 4).filter(w->w>0).count();
        System.out.println(count2);

    }
}
