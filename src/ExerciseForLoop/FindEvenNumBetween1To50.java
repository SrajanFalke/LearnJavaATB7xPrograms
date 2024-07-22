package ExerciseForLoop;

public class FindEvenNumBetween1To50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i%2 == 0) {
                System.out.println(i);
                if (i == 20) {
break;
                }
            }
        }
    }
}
