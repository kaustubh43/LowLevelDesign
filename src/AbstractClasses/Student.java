package AbstractClasses;

import AbstractClasses.User;

public class Student extends User {
    private int age;
    private int grade;

    public Student(String name, String password, String email, int age, int grade) {
        super(name, password, email);
        this.age = age;
        this.grade = grade;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }
}
