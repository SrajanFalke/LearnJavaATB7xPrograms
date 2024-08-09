package StringBuilderAndStringBuffer;

public class CharFInd {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        sb.append("Welcome");
        System.out.println("String: "+sb);
        System.out.println("Char at index 3 is: "+sb.charAt(3));
    }
}
