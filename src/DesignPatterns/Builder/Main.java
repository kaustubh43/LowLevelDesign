package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Helper h = new Helper();
        h.setId(99L);
        h.setName("Kaustubh");
        h.setBatch("Intermediate");

        Student student = new Student(h);
    }
}
