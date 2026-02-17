import java.util.Scanner; // Import Scanner class

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println();

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        System.out.println("You entered: " + input);

        // Close scanner
        scanner.close()
    }
}
