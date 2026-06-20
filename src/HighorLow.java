import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner in = new Scanner(System.in);
        Random generator = new Random(); //Random number generator

        // Generate a random int value between 1 and 10 inclusive
        // generator.nextInt(10) gives 0-9, so we add 1 to get 1-10
        int randomNumber = generator.nextInt(10) + 1;

        //Declare variables
        int userGuess = 0;
        String trash = ""; // Clear and display invalid inputs
        boolean done = false; // Loop control flag
        int tempInput; // Temp variable to validate range before assignment

        //Get and bulletproof the user's guess (Must be an int 1 to 10)
        do {
            System.out.print("Guess the secret number (an integer from 1 to 10): ");

            if (in.hasNextInt()) { // Check if input is a valid integer
                tempInput = in.nextInt();
                in.nextLine();
                if (tempInput >= 1 && tempInput <= 10) { // Check for valid range 1-10
                    userGuess = tempInput;
                    done = true;
                } else {
                    System.out.println("\nError: Your guess must be between 1 and 10 inclusive.");
                    System.out.println("Please try again.\n");
                }
            } else {
                trash = in.nextLine(); // read bad text input as a String
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You must enter a valid integer value!\n");
            }
        } while (!done);

        //Output
        System.out.println("The computer's random number generated was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Right on the money! You win!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was too low!");
        }
    }
}
