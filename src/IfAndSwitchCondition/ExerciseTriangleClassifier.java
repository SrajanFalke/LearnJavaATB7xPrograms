package IfAndSwitchCondition;

import java.util.Scanner;

public class ExerciseTriangleClassifier {
    public static void main(String[] args) {
        int side1,side2,side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1");
        side1 = sc.nextInt();
        System.out.println("Enter the side 2");
        side2 = sc.nextInt();
        System.out.println("Enter the side 3");
        side3 = sc.nextInt();

        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("The triangle is equilateral");
        } else if (side1 == side2+side3) {
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is scalene");
        }
    }
}
