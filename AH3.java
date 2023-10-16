import java.util.Scanner;

public class AH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in a number to see the fizzbuzz: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) System.out.println("Fizz");
            else if (i % 5 == 0 && i % 3 != 0) System.out.println("Buzz");
            else if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else System.out.println(i);
        }
    }
}
