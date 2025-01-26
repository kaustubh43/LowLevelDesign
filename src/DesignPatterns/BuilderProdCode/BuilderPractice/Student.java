package DesignPatterns.BuilderProdCode.BuilderPractice;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String batch;

    private Student(Builder builder){
        // Validations go here
        if(builder.name == null){
            throw new IllegalStateException("Student name cannot be null");
        }
        // Assignments here
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.batch = builder.batch;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    static class Builder{
        private String name;
        private int age;
        private String gender;
        private String batch;

        private Builder() {}

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public Builder setBatch(String batch){
            this.batch = batch;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
