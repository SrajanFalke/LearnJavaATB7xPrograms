package Encapsulation;

public class Teacher {
    private String designation = "Maths Teacher";
    private String collegeName = "saraswati sishu mandir";

    public String getDesignation() {
        return designation;
    }
    protected void setDesignation(String designation) {
        this.designation = designation;
    }
    protected String getCollegeName() {
        return collegeName;
    }
    protected void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    void does(){
        System.out.println("Teaching");
    }
}

}
