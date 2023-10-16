import java.util.Scanner;

public class AH3 {
    public static void fizzbuzz(int rand) {
        if (rand == 0) return;

        if (rand % 5 == 0 && rand % 3 == 0) System.out.println("FizzBuzz");
        else if (rand % 5 == 0 && rand % 3 != 0) System.out.println("Buzz");
        else if (rand % 3 == 0 && rand % 5 == 0) System.out.println("FizzBuzz");
        else System.out.println(rand);

        fizzbuzz(rand - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in a number to see the fizzbuzz: ");
        int n = sc.nextInt();

        fizzbuzz(n);
    }
}
