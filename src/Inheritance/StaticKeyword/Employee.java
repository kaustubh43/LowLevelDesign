package Inheritance.StaticKeyword;

public class Employee {
    private static int employeeCount = 0;
    private String name;
    private int salary;

    // Parameterised constructors: single param - name
    public Employee(String name) {
        this.name = name;
        Employee.addEmployee();
    }

    // Parameterised constructors: double param - name and salary
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static void addEmployee(){
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
