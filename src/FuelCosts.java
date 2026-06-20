import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner in = new Scanner(System.in);

        //Declare variables
        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;

        String trash = ""; //Clear and display invalid inputs
        boolean done;      // Loop control flag
        double tempInput;

        //Get Gallons of Gas in Tank - loop 1
        done = false;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                tempInput = in.nextDouble();
                in.nextLine();
                if ( tempInput > 0 ) { //Check if entered value is valid (> 0)
                    gallonsInTank = tempInput;
                    done = true;
                }
                else {
                    System.out.println("\nError: Gallons must be greater than 0.");
                    System.out.println("Please try again.\n");
                }
            } else {
                trash = in.nextLine(); // Read bad input as a String
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You must enter a valid numeric value for gallons. Try again.\n");
            }
        } while (!done); // End of loop 1

        //Get fuel efficiency - loop 2
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon (MPG): ");
            if (in.hasNextDouble()) {
                tempInput = in.nextDouble();
                in.nextLine();
                if ( tempInput > 0 ) { //Check if entered value is valid (> 0)
                    fuelEfficiency = tempInput;
                    done = true;
                }
                else {
                    System.out.println("\nError: Fuel efficiency (MPG) must be greater than 0.");
                    System.out.println("Please try again.\n");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You must enter a valid numeric value for MPG. Try again.\n");
            }
        } while (!done); // End of loop 2

        //Get Price Per Gallon - Loop 3
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: $");
            if (in.hasNextDouble()) {
                tempInput = in.nextDouble();
                in.nextLine();
                if (tempInput > 0) {
                    pricePerGallon = tempInput;
                    done = true;
                } else {
                    System.out.println("\nError: Price must be greater than $0.00.");
                    System.out.println("Please try again.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You must enter a valid numeric value for the price. Try again.\n");
            }
        } while (!done); // End of loop 3

        // Processing - Cost to drive 100 miles = (100 / MPG) * price per gallon
        double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;

        // Total distance = gallons in tank * MPG
        double totalDistance = gallonsInTank * fuelEfficiency;

        // Output
        System.out.println("\n************* Fuel Report ******************");
        System.out.printf("The cost to drive 100 miles is:                $%.2f\n", costPer100Miles);
        System.out.printf("The distance the car can go on a full tank is: %.2f miles\n", totalDistance);
        System.out.println("********************************************");
    }
}
