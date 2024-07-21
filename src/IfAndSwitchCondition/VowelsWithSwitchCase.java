package IfAndSwitchCondition;

import java.util.Scanner;

public class VowelsWithSwitchCase {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the alphabets");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        switch (ch){
            case 'a' -> System.out.println("a is vowels");
            case 'e' -> System.out.println("e is vowels");
            case 'i' -> System.out.println("i is vowels");
            case 'o' -> System.out.println("o is vowels");
            case 'u' -> System.out.println("u is vowels");
            default -> System.out.println("consonant");
        }

    }
}
