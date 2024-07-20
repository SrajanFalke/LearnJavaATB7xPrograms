package IfAndSwitchCondition;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
//        write a program to find a age number
        int age;
        System.out.println("please enter the age:");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        if(age >= 18){
            System.out.println("Valid for voting");
        }
        else{
            System.out.println("Invalid for voting");
        }
    }
}
