package Oops;

public class BullDog extends Dog{
    void breed(){
        System.out.println("BullDog");
    }
    void height(){
        System.out.println("BullDog height");
    }

    public static void main(String[] args) {
        BullDog b = new BullDog();
        b.bark();
        b.run();
        b.eat();
        b.walk();
        b.breed();
        b.height();
    }

}
