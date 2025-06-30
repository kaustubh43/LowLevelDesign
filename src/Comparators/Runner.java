package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Alice");
        person1.setAge(30);

        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(25);

        Person person3 = new Person();
        person3.setName("Charlie");
        person3.setAge(35);

        persons.add(person1); persons.add(person2); persons.add(person3);

        System.out.println("Before sorting:");
        for (Person person : persons) {
            System.out.println(person);
        }

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());   // Sort by age, Ascending order
            }
        });

        System.out.println("\nAfter sorting by age:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
