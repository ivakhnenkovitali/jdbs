package by._java_SE._5_arrays;

import java.util.Arrays;

public class Main_1 {
    public static void main(String[] args) {

        int [] arr = new int[5];

        int max = 1, min = 10;
        for (int i =0; i< arr.length; i++){
            arr[i] = (int)(Math.random()*(max-min+1)+min);
        }
        System.out.println(Arrays.toString(arr));

//        for (int i : arr) {
//            arr[i] = (int)(Math.random()*(max-min+1)+min);
//        }
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arrDelete = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arrDelete));

        int[] arrAdd = Arrays.copyOf(arr,arr.length+5);
        System.out.println(Arrays.toString(arrAdd));


        String [] arr1 = new String[4];
        Double[] arr2 = new Double[4];
        double[] arr3 = new double[4];
        arr3[0] = 25.0;


       // String[] seasons  = {"Winter", "Spring", "Summer", "Autumn"};

        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }




        int[][] myTwoDimentionalArray = new int [8][8];


    }
}
