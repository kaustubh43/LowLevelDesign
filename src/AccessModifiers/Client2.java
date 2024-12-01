package AccessModifiers;

import IntroToOOP.Student;

public class Client2 {

    public static void main(String[] args) {
        Student s1 = new Student("Kaustubh", 26, 2020);
        System.out.printf("Student name is %s%n", s1.name);
        System.out.printf("Student graduation year is %s%n", s1.gradYear);

        Student s2 = new Student("Eshani", 25);
        System.out.printf("Student name is %s%n", s2.name);

    }
}
