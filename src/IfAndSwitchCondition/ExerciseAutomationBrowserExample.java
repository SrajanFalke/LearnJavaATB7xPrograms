package IfAndSwitchCondition;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseAutomationBrowserExample {
    public static void main(String[] args) {
        String browser;
        System.out.println("Enter the browser");
        Scanner sc = new Scanner(System.in);
        browser = sc.next().toLowerCase();

        switch (browser){
            case "Chrome":
                System.out.println("Launching chrome");
                break;
            case "Edge":
                System.out.println("Launching Edge");
                break;
            case "Firefox":
                System.out.println("Launching fireFox");
                break;
            default:
                System.out.println("No idea");
                break;
        }
    }
}
