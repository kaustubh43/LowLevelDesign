package DesignPatterns.Prototype;

public class Student implements CloneObject<Student> {
    private int id;
    private String name;
    private int age;

    // Parameterised constructor.
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Copy constructor.
    public Student(Student other) {
        this.id = other.id + 1;
        this.name = other.name;
        this.age = other.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Student cloneObject() {
        return new Student(this);
    }
}
