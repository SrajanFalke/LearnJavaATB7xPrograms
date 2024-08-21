package Oops.methodoverridding;

public class Runner {
    public static void main(String[] args) {
        Dogmethodoverridding d = new Dogmethodoverridding();
        d.eat();
        d.bark();
        d.walk("by 4 legs");

        Hound h = new Hound();
        h.bark();
        h.walk("By 2 legs");
        h.eat();

        // this is called polymorphic reference
        Dogmethodoverridding e = new Hound();
        e.walk("20 legs");
        e.bark();
        e.eat();
    }
}
