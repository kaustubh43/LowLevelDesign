package DesignPatterns.Builder;

public class Helper {
    private String name;
    private Long id;
    private String batch;
    private double psp;
    private String university;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getBatch() {
        return batch;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversity() {
        return university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
