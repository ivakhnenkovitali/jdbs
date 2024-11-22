package by._java_SE._5_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3};
        int[] nums1 = {1, 2, 3};

        int[] nums2 = new int[4];
        nums2[3] = 5;
        System.out.println(nums2[3]);   // 5
        System.out.println(nums2[0]);   // 0
        //    System.out.println(nums2[5]);   нет такого индекса
        int length = nums2.length;
        System.out.println(length); // 4

        int last = nums2[nums2.length - 1];
        System.out.println(last);  //5

        char[] arr = new char[2];
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));

        String[] arr1 = new String[3];
        System.out.println(Arrays.toString(arr1));


        int[][] arr2 = new int[2][3];

        int[][] arr3 = {{1, 2}, {1, 2, 3}};  // 1 строка = 1,2  // 2 строка = 1,2,3

        System.out.println("--------------");
// вывод двумерного массива
        int[][] arr4 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                null,   // КАК ИЗМЕНИТЬ
                {8, 9}
        };

        for (int[] ints : arr4) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("--------------");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; (arr4[i] != null && j < arr4[i].length); j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");
        arr4[0][0] = 55;
        for (int[] i : arr4) {
            System.out.println(Arrays.toString(i));
        }


        int[][][] arr5 = new int[2][3][4];


        System.out.println("---------foreach-------------");
        for (float i : nums) {
            System.out.println(i);  // 1.0 2.0 3.0 рЕКОМЕНТУЕТСЯ ТИПЫ СОВПАДАТЬ
        }

        for (int i : nums) {
            System.out.println(i);  //  1 2 3
        }

//        for (float i = 0; i<nums.length; i++){
//            System.out.println(nums[i]); ошибка
//        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("===================");
        for (int i : nums) {
            i = i + 10;
            System.out.println(i);  // 11 12 13 НО НЕ ИЗМЕНИТ
        }

        for (int i : nums) {
            System.out.println(i);  // 1 2 3  НЕ ИЗМЕНИЛ!!!
        }

        System.out.println("===================");
        for (int i = 0; i < nums1.length; i++) {
           nums1[i] = nums1[i]+20;
            System.out.println(nums1[i]);  // 21 22 23 ИЗМЕНИТ
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);  // 21 22 23 ИЗМЕНИТ
        }
    }
}
