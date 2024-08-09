package StringBuilderAndStringBuffer;

public class ReplaceTheValue {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hi Guys!");

        //replace "Hi" with "Hello"
        sb.replace(0,2,"Hello");
        System.out.println(sb);
    }
}
