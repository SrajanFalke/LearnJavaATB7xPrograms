package StringBuilderAndStringBuffer;

public class AppendtheValue {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("this is for appending");
        //appending specified string at the end of given string.
        sb=sb.append(" the value");
        System.out.println(sb);
    }
}
