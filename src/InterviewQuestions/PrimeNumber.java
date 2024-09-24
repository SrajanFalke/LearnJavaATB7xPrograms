package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prime number :");
        int n = sc.nextInt();
        System.out.println("Prime number between 1 to" + n);
        for (int i = 1; i < n; i++) { // first intialization int i = 1; i<n; sout(i) i++
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime){
                System.out.print(i + " ");
            }

        }
    }

}
