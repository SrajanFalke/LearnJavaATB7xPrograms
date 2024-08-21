package Oops.Poly.MethodOverloading;

public class ExampleMethodOverloading {
//    complie time polymorphism/static/method overloading
    public void add(){
        System.out.println("this is the overloading");
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public String add(String a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }
}
