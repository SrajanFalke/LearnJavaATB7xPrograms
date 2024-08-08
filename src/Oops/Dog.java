package Oops;

public class Dog extends Animal{
    void walk(){
        System.out.println("walking");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.eat();
        d.bark();
        d.walk();
    }
}
