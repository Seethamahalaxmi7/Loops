import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for range
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Even Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) { // Even numbers
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) { // Odd numbers
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
