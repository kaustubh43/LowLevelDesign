package DesignPatterns.Builder;

public class Student {
    private String name;
    private Long id;
    private String batch;
    private double psp;
    private String university;

    public Student(Helper helper){
        // All validations
        if(helper.getId() == null)
            throw new IllegalStateException("ID cannot be 0");
        else if(helper.getName() == null)
            throw new IllegalStateException("Name cannot be null");

        // Setting of the values.
        this.id = helper.getId();
        this.batch = helper.getBatch();
        this.psp = helper.getPsp();
        this.university = helper.getUniversity();
        this.name = helper.getName();
    }

    // No public setters.
    void changeBatch(String newBatch){
        System.out.println("old batch" + this.batch);
        this.batch = newBatch;
        System.out.println("new batch" + this.batch);
    }
}
