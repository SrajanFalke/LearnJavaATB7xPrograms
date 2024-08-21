package Oops.Encapsulation;

class Teacher {
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
public class JrTeacher {
    String mainSubject = "Physics";
    public static void main(String args[]){
        Teacher obj = new Teacher();
        /* Note: we are not accessing the data members
         * directly we are using public getter method
         * to access the private members of parent class
         */
        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        obj.does();
    }
}
