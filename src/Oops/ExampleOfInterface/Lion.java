package Oops.ExampleOfInterface;

public class Lion implements Animal{
    int age = 50;
    String s = "months";
    @Override
    public void sound() {
        System.out.println("lion is roaring");
        System.out.println(age + " " + s);
    }

    @Override
    public void eat() {
        System.out.println("lion is also a non-veg");
    }
}
