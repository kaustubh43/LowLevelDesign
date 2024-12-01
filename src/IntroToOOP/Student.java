package IntroToOOP;

public class Student {
    public String name;
    int age;
    public int gradYear;

    public Student(String name, int age, int gradYear) {
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
