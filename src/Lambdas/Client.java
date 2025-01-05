package Lambdas;

import Concurrency.RunnableClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        // Normal way of running a thread.
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();

        // Running a thread using class definition here
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello World from custom class");
            }
        });
        t2.start();
        // The above way, defines a class and creates a new object of that type runnable.

        // Running a thread using a lambda
        Thread t3 = new Thread(() -> System.out.println("Hello World from Lambda"));
        t3.start();

        ArrayList<Integer> list = new ArrayList<>();

        Consumer<Integer> c = a -> System.out.println(a + 10);
        c.accept(10);

        Function<Integer, Integer> f = x -> x * x;
        System.out.println(f.apply(12));

        BiConsumer<Integer, String> biConsumer = (x, y) -> System.out.println(x + " " + y);
        biConsumer.accept(12, "Hello World");

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = list1.stream().filter(x -> x % 2 == 0).toList();
    }
}
