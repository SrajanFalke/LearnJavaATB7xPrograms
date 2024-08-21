package Oops.ConstructerInJava;

public class ParametrizedCons {
    int age;
    String name;

    ParametrizedCons(int empAge, String empName){
        this.age = empAge;
        this.name = empName;
    }
    public void employeeInfo(){
        System.out.println(age + name);
    }

    public static void main(String[] args) {
        ParametrizedCons p = new ParametrizedCons(12 , "SK");
        p.employeeInfo();

    }
}
