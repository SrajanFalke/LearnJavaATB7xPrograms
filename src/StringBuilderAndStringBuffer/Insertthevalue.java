package StringBuilderAndStringBuffer;

public class Insertthevalue {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("this is practice");
        //insert "StringBuilder" string after "is"
        //index starts with 0 so the index of s is 6
        sb.insert(7," StringBuilder");
        System.out.println(sb);
    }
}
