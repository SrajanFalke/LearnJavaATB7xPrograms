package StringBuilderAndStringBuffer;

public class ExampleOfCompareFunc {
    public static void main(String[] args) {
        String x = "A";
        String y = "B";
        System.out.println(x.compareTo(y)); // "A".compareTo("B") -1
        System.out.println(y.compareTo(x)); // 1
        System.out.println(x.compareTo(x)); // 0

        Integer a = 20;
        Integer b = 10;
        System.out.println(a.compareTo(b)); // +1
        System.out.println(b.compareTo(a)); // -1
        System.out.println(b.compareTo(b)); // 0

        Double i = 1.5;
        Double j = 1.7;
        System.out.println(i.compareTo(j)); // -1
        System.out.println(j.compareTo(i)); // +1
        System.out.println(i.compareTo(i)); // 0
    }
}
