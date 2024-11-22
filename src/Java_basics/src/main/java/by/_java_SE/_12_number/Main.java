package by._java_SE._12_number;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
//        Long x = 100000l;
//        Integer y = (Integer) x.intValue();


        List<Integer> list = asList(1, 33, 6, 8, 10, 36);
        list.stream()
               .peek(s -> System.out.println(s))
                .sorted()
                .peek(s-> System.out.println(s))
                .forEach(s-> System.out.println(s));


    }


}
