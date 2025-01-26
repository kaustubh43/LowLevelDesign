package DesignPatterns.BuilderProdCode;


public class Main {
    public static void main(String[] args) {

//        Creating a builder object and then passing to the Student constructor.
//        Student.Builder builderObject = Student.newBuilder();
//        builderObject.setBatch("intermediate");
//        builderObject.setId(55L);
//        Student s = new Student(builderObject);

        Student s = Student.newBuilder()
                .setId(66L)
                .setName("Kaustubh")
                .setUniversity("GU")
                .setPsp(97.0d)
                .setBatch("intermediate")
                .build();

//        s.setName("Eshani");      // Cannot do this since this is not accessible.

    }
}
