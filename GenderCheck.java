import java.util.Scanner;

public class GenderCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);
        sc.close();
        
        switch (Character.toUpperCase(gender)) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}