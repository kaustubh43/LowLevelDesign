package Concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summation {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        list.forEach(n -> sum += n);  // Compile error.
        System.out.println(sum);
    }
}
