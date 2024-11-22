package by._java_SE._3_variables;

public class Main_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int result = b * 3 + 20 / 2 * a--;

        int step1 = b * 3; //15
        int step2 = 20 / 2; // 10
        int step3 = a--;   // 2   !!!!!!!!!!!!!!!!!
        int step4 = step2 * step3;  // 20
        int step5 = step1 + step4;  // 35

        System.out.println(step5);
        System.out.println(result); // 35
        System.out.println("---------------------");

        int num1 = 4;
        int num2 = 5;
        int num3 = 15;
        int num4 = 10;
        int num5 = 5;
        int result1 = 12;
        result1 += num1 * num2 + num3 % num4 / num5;

        int step11 = num1 * num2;  // 20
        int step21 = num3 % num4;  // 5
        int step31 = step21 / num5;  // 1
        int step41 = step11 + step31;  // 21
        int step51 = result1 + step41;  // 12 + 21 = 33
        System.out.println(step51);  // 54
        System.out.println(result1); //33

        System.out.println("---------------------");
        int x = 8;
        int y = 9;
        int z = x++ + ++y;
        System.out.println(z); // 18
        /*Переменная z будет равна 18. Вначале будут выполняться выражения инкрементов переменных x и y.
         Выражение x++ увеличит переменную x на единицу, но возвратит ее предыдущее значение - число 8.
         Выражение ++y увеличит значение переменной y и возвратит ее новое значение,
         то есть число 10. В итоге мы получим 8 + 10 = 18.
         */
        System.out.println("-----------------");
        double x3 = 8.8;
        double y3 = 1.5;
        double z3 = x3 - y3;
        System.out.println(z3); // 7.300000000000001



    }
}
