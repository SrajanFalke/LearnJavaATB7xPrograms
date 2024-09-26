package WrapperClass;

public class BoxingDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(a);
        System.out.println(a+" "+b);
        char c = 'A';
        Character d = new Character(c);
        System.out.println(c+" "+d);
    }
}
