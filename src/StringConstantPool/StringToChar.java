package StringConstantPool;

public class StringToChar {
    public static void main(String[] args) {
        String s1 = "Srajan";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.println("character at " + i + "th index is :" + ch );
        }

    }
}
