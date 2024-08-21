package Oops.ConstructerInJava;

public class DefaultCons {
    int age;
    public void number(int a){
        this.age = a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        DefaultCons d = new DefaultCons();
        d.number(45);
    }
}
