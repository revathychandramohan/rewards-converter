import java.util.Scanner;

/**
 * The RewardsConverter class converts cash value to airline miles.
 * It prompts the user to enter a cash value and then converts it to miles using a conversion rate.
 * The converted miles value is displayed to the user.
 */
public class RewardsConverter {
    
    /**
     * The main method of the RewardsConverter class.
     * It handles user input, conversion, and output.
     * @param args The command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        var scanner = new Scanner(System.in);
        
        // Welcome message
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        
        // Prompt the user to enter a cash value
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        
        // Initialize cashValue variable to store the parsed cash value
        double cashValue;
        
        // Try parsing the input value to a double
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            // Handle the case where input value cannot be parsed as a double
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        
        // Display conversion process message
        System.out.println("Converting $" + input_value + " to miles");
        
        // Create a RewardValue object with the parsed cash value
        var rewardsValue = new RewardValue(cashValue);
        
        // Display the converted miles value to the user
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
