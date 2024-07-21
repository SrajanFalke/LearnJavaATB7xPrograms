package IfAndSwitchCondition;

import java.util.Scanner;

public class VowelsWithIfstatements {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch=='a'){
            System.out.println("a is vowels");
        } else if (ch=='e') {
            System.out.println("e is vowels");
        }
        else if (ch=='i') {
            System.out.println("e is vowels");
        }
        else if (ch=='o') {
            System.out.println("e is vowels");
        }
        else if (ch=='u') {
            System.out.println("e is vowels");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
