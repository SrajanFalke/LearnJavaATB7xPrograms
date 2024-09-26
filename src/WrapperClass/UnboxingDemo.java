package WrapperClass;

public class UnboxingDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(a);
        System.out.println(a+" "+b);
        char c = 'A';
        Character d = new Character(c);
        System.out.println(c+" "+d);
        System.out.println("-------");
        Integer x = new Integer(25);
        int y = x;
        System.out.println(x+" "+y);

        Double i = new Double(1.5);
        double j = i;
        System.out.println(i+" "+j);
    }
}
