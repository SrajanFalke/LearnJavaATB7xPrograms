package Arrays;

import java.util.Scanner;

public class ArrayCreateWithNewKeyword {
    public static void main(String[] args) {
        String name[] = new String[3];
//        name[0] = "Srajan";
//        name[1] = "Aditi";
//        name[2] = "Shubham";

        Scanner sc = new Scanner(System.in);
        name[0] = sc.next();
        name[1] = sc.next();
        name[2] = sc.next();
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

//        Traverse the data
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + "-->" + name[i]);
        }
    }
}
