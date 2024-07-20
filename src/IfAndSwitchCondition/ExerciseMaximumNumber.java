package IfAndSwitchCondition;

import java.util.Scanner;

public class ExerciseMaximumNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + "," + "First number is maximum");
        } else if (num1<num2) {
            System.out.println(num2 + "," + "Second number is maximum");
        }
        else {
            System.out.println("Both are equal numbers");
        }
    }
}
