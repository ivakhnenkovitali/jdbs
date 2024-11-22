package by._java_SE._5_arrays;

public class Main_ {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};

        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        for (int i = 10; i < 20; i += 2) {
            if (i > 15) {
                break;
            }
            if (i % 4 == 0) {
                System.out.println(i+"yes - пропусти");
                continue;
            }
            System.out.println(i);

        }

    }


}
