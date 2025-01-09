package IntroToOOP;

import AccessModifiers.Student;

public class NewClient {
    public static void main(String[] args) {
        AsiaCup asiaCup = new AsiaCup();
        System.out.println(asiaCup.getName());
        Student s = new Student();
        s.name = "Kaustubh";
//        s.age = "26"; Not accessible.
//        s.division = "12"; // Not Accessible
    }
}
