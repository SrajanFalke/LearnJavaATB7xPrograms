package IfAndSwitchCondition;

import java.util.Scanner;

public class ExerciseSwitchCase {
    public static void main(String[] args) {
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");

        days = sc.nextInt();

        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("No idea");
                break;
        }
    }
}
