import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner in = new Scanner(System.in);

        //Declare variables
        double width = 0.0;
        double height = 0.0;

        String trash = ""; //Clear and display invalid inputs
        boolean done;      // Loop control flag
        double tempInput; // Temp variable to validate range before assignment

        //Get the width of a rectangle - loop 1
        done = false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                tempInput = in.nextDouble();
                in.nextLine();

                if (tempInput > 0) { //Check if value is greater than 0
                    width = tempInput;
                    done = true;
                } else {
                    System.out.println("\nError: Width must be greater than 0.");
                    System.out.println("Please try again.\n");
                }
            } else {
                trash = in.nextLine(); // Read bad text input as a String
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You must enter a valid numeric value for the width\n");
            }
        } while (!done); //End of loop 1

        //Get Height of the Rectangle - loop 2
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                tempInput = in.nextDouble();
                in.nextLine();
                if (tempInput > 0) {
                    height = tempInput;
                    done = true;
                } else {
                    System.out.println("\nError: Height must be greater than 0.");
                    System.out.println("Please try again.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You must enter a valid numeric value for the height\n");
            }
        } while (!done); //End of loop 2

        //Process area, perimeter and diagonal
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        //Output
        System.out.printf("The area of your rectangle is:        %.2f\n", area);
        System.out.printf("The perimeter of your rectangle is:   %.2f\n", perimeter);
        System.out.printf("The length of the diagonal is:    %.2f\n", diagonal);
    }
}
