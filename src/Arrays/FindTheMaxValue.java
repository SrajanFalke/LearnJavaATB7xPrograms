package Arrays;

import java.util.Arrays;

public class FindTheMaxValue {
    public static void main(String[] args) {
        int salary[] = {25,12,20,5,4,8};
        int max = 1;
        int min = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
               max = salary[i];
           }
            if (salary[i] < min) {
                min = salary[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

        Arrays.sort(salary);
        System.out.println(salary[salary.length-1]);
    }
}
