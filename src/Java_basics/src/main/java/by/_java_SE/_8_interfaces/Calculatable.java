package by._java_SE._8_interfaces;

public interface Calculatable {
    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b,c);
    }

    private int sumAll(int...values) {
        int result = 0;
        for (int i :values){
            result += i;
        }
        return result;
    }


}
