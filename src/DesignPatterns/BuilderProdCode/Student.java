package DesignPatterns.BuilderProdCode;

public class Student {
    private String name;
    private Long id;
    private String batch;
    private double psp;
    private String university;

    // constructor is private and can be invoked only by Builder.
    private Student(Builder builder) {
        // All validations
        if(builder.id == null)
            throw new IllegalStateException("ID cannot be 0 or null");
        else if(builder.name == null)
            throw new IllegalStateException("Name cannot be null");

        // Setting of the values.
        this.id = builder.id;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.university = builder.university;
        this.name = builder.name;
        System.out.println("Object created successfully:: " + this.name);
    }

    // This is used for creating a builder object from the outside world.
    public static Builder newBuilder() {
        return new Builder();
    }

    // Static builder class, used to create the object
    // and then pass them to student object.
    // Need to be static to be able to call it without instantiating.
    static class Builder {
        private String name;
        private Long id;
        private String batch;
        private double psp;
        private String university;

        private Builder() {}    // Not accessible from the outside world.

        // Finally builds the object.
        public Student build() {
            return new Student(this);   // Create a new Student object using student constructor.
                                        // and send builder object in the constructor.
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
    }

    // No public setters.
    void changeBatch(String newBatch){
        System.out.println("old batch" + this.batch);
        this.batch = newBatch;
        System.out.println("new batch" + this.batch);
    }
}
