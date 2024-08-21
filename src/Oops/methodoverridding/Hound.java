package Oops.methodoverridding;

public class Hound extends Dogmethodoverridding{
    @Override
    public void bark() {
        System.out.println("Hound is barking very slow");
    }

    @Override
    public void eat() {
        System.out.println("eats very less");
    }

    @Override
    public void walk(String legs) {
        super.walk(legs);
    }
}
