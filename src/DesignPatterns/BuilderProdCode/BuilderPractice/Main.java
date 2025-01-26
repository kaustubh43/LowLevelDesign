package DesignPatterns.BuilderProdCode.BuilderPractice;

public class Main {
    public static void main(String[] args) {
        QueryBuilder q = QueryBuilder.getBuilder()
                        .setFrom("DemoFrom")
                        .setJoin("DemoJoin")
                        .setSelect("Print")
                        .setGroupBy("Name")
                        .setWhere("whereDemo")
                        .setOrderBy("something").build();
        System.out.println("Done");

        Student student = Student.getBuilder()
                .setName("Kaustubh")
                .setAge(26)
                .build();

        System.out.println("Student object is created: Done");
    }
}
