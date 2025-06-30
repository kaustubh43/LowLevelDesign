package Comparators;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
