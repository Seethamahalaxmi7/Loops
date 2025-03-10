import java.util.Scanner;

public class EvenOddChecks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        switch (n % 2) {
            case 0:
                System.out.println(n + " is an Even number.");
                break;
            case 1:
            case -1:
                System.out.println(n + " is an Odd number.");
                break;
        }
    }
}
