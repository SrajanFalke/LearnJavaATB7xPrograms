package StringConstantPool;

public class ExStringEqualsMethod {
    public static void main(String[] args) {
        String s1 = "Java learning";
        String s2 = "Java learning";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("java learning");
        String s4 = new String("java learning");

        System.out.println(s3 == s4);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));
    }
}
