package Oops.ExamplesOfSuperKeyword;

public class Car extends Vhechle{
    private int maxspeeds = 280;

    @Override
    public void display() {
        super.display();
        System.out.println(this.maxspeeds);
        System.out.println(super.maxspeed);

    }

    public Car() {
        super();
    }
}
