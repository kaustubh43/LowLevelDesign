package AbstractClasses;

import InterfacesDemo.Person;

public class Student extends Person {
    public Student(int age, String firstName, String lastName) {
        super(age, firstName, lastName);
    }

    @Override
    public void setRole(String role) {
        System.out.println("Setting role to " + role);
    }
}
