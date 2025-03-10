public class LargestNumber {
    public static void main(String[] args) {
        // Define the numbers
        int a = 10;
        int b = 20;
        int c = 30;

        // Variable to hold the largest number
        int largest;

        // Compare the numbers using if-else statements
        if (a > b && a > c) {
            largest = a;
        } else if (b > c) {
            largest = b;
        } else {
            largest = c;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
