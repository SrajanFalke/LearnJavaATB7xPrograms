package Arrays;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Float marks[] = new Float[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks subject" + (i+1));
            marks[i]= sc.nextFloat();
        }
        float avrMarks = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println(avrMarks);
    }
}
