import java.util.Scanner;

public class EqualityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two integer inputs
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Checking equality
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }

        // Checking inequality
        if (num1 != num2) {
            System.out.println("The numbers are different.");
        } else {
            System.out.println("The numbers are the same.");
        }

        scanner.close();
    }
}
