package StringBuilderAndStringBuffer;

public class DeletetheSubString {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("BeginnersBook");

        //delete substring "Beginners"
        sb.delete(0, 9);
        System.out.println(sb);
    }
}
