import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner in = new Scanner(System.in);
        //Declare variables
        double celsius = 0.0;
        double fahrenheit;
        String trash = ""; // Clear and display invalid inputs
        boolean done = false;

        // loop for input until a valid double is provided
        do {
            System.out.print("Enter your temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;   // Valid numeric input received
            } else {
                // Read non-double data entered as a string
                trash = in.nextLine();
                System.out.println("You said your input was: " + trash);
                System.out.println("You have to enter a valid numeric temperature, try again!");
            }
        } while (!done);

        // Processing - Convert Celsius to Fahrenheit
        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Output
        System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F", fahrenheit);

    }
}
