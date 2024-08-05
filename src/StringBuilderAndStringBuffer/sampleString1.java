package StringBuilderAndStringBuffer;

public class sampleString1 {
    public static void main(String[] args) {
        String s1 = "Srajan";
        StringBuilder s2 = new StringBuilder(" Falke");
        s2=s2.append(s1);
        System.out.printf(String.valueOf(s2));
    }
}
