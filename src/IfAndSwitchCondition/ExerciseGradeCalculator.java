package IfAndSwitchCondition;

import java.util.Scanner;

public class ExerciseGradeCalculator {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        i = sc.nextInt();
        if(i>=90 && i <=100){
            System.out.println("Grade A");
        } else if (i>=80 && i <=89) {
            System.out.println("Grade B");
        } else if (i>=70 && i <=79) {
            System.out.println("Grade C");
        } else if (i>=60 && i <=69) {
            System.out.println("Grade D");
        } else if (i>=33 && i <=59) {
            System.out.println("Grade E");
        }
else{
            System.out.println("You are failed");
        }
    }

}
