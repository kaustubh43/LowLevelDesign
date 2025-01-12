package InterfacesDemo;

public abstract class Person implements PersonInterface{
    int age;
    String firstName;
    String lastName;
    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printPerson() {
        System.out.println(firstName + " " + lastName);
    }

    @Override
    public String getFirstName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public abstract void setRole(String role);
}
