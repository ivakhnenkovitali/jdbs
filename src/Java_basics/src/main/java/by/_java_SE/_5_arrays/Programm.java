package by._java_SE._5_arrays;

public class Programm {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");


        Cat[][] cats1 = new Cat[3][5];
        cats1[1][2] = new Cat("Tom");
        for (int i = 0; i < cats1.length; i++) {
            for (int j = 0; j < cats1[i].length; j++) {
                System.out.println(cats1[i][j]);
            }
            System.out.println();
        }
        System.out.println(cats1.length);
    }
}
