package Inheritance.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tommy", 80000);
        Employee emp2 = new Employee("Rambo", 150000);

        System.out.println(emp1);
        System.out.println(Employee.getEmployeeCount());
    }
}
