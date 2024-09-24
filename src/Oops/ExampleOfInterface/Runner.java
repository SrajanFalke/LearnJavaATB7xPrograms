package Oops.ExampleOfInterface;

public class Runner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sound();

        Lion l = new Lion();
        l.sound();
        l.eat();
    }
}
