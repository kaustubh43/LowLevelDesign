package Generics;

import java.util.*;

public class StudentSorter implements Comparator<Student>{
    public static void sortStudentsByAgeDescending(List<Student> students) {

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 22));

        sortStudentsByAgeDescending(students);

        for(Student s:students){
            System.out.println(s.getName()+" "+s.getAge());
        }
    }

}
