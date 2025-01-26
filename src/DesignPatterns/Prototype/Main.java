package DesignPatterns.Prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kaustubh", 26);
        Student s2 = s1.cloneObject();
        s2.setName("Eshani");
    }
}
