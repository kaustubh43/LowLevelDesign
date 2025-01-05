package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<String> allFruits = Arrays.asList("Apple", "Banana", "Apricot", "Avocado", "Orange");
        List<String> fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);
    }
    public static List<String> filterFruitsStartingWithA(List<String> fruits) {
        return fruits.stream().filter(fruit -> fruit.startsWith("A")).toList();
    }
}
