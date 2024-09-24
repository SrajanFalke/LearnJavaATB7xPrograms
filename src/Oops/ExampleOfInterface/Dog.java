package Oops.ExampleOfInterface;

public class Dog implements Animal,Pets{
    @Override
    public void sound() {
        System.out.println("Dog is woofing");
        System.out.println(petage + " " + petyear);
    }

    @Override
    public void eat() {
        System.out.println("Dog is taking non-veg and veg also");
    }
}
