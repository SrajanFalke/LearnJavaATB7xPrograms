package Oops.Poly.MethodOverloading;

public class ChildClass extends ExampleMethodOverloading{
    public static void main(String[] args) {
        ExampleMethodOverloading mo = new ExampleMethodOverloading();
        String s = mo.add("srajan",05);
        System.out.println(s);
        int r = mo.add(10,20);
        System.out.println(r);
    }
}
