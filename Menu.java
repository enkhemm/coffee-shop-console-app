import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is a comprehensive class that represents more than the menu options for the program.
 * It displays user's options and also handles logic for user interaction for ordering coffee or
 * tea. Everything happens here, from creating the beverage objects, writing and extracting
 * from the file, to the checkout process, where the program exits with code 0.
 *
 * @author Emmy
 * @version 1
 * 
 * Preconditions:
 * - The Files, Coffee, Tea class must be properly implemented to handle file I/O operations.
 * Postconditions:
 * - The user can place orders for coffee or tea, view options, and proceed to checkout.
 * - Orders are saved to a file and can be reviewed before checkout.

 */
public class Menu
{
    Scanner kb = new Scanner(System.in);
    /*
     * Displays the main option to the user.
     */
    public static void chooseDrink() {
        System.out.println("Choose from the following: ");
        System.out.println("1. Order Coffee.");
        System.out.println("2. Order Tea.");
        System.out.println("3. See what options you have for these beverages.");
        System.out.println("Enter number 1 - 3");
    }

    /*
     * Handles the process of ordering a coffee with all the user choices and then creates 
     * the coffe object and saves to file. Calls next menu.
     * 
     * Preconditions:
     * - The user must enter valid indices for each customization option
     * 
     * Postconditions:
     * - A Coffee object is created with the specified attributes.
     * - The order is saved to the file "order.txt"
     * - The user is prompted with the affter-order menu.
     */
    public void orderCoffee() {

        System.out.println("Let's customize your coffee!");

        System.out.println("Choose coffee size:");
        System.out.println("0. Small");
        System.out.println("1. Medium");
        System.out.println("2. Large");
        System.out.println("Enter a number 0-2");
        int sizeIndex = kb.nextInt();

        System.out.println("Choose coffee base:");
        System.out.println("0. Espresso");
        System.out.println("1. Cappuccino");
        System.out.println("2. Latte");
        System.out.println("3. Mocha");
        System.out.println("4. Frappe");
        System.out.println("Enter a number  0-4");
        int baseIndex = kb.nextInt();

        System.out.println("Choose coffee temperature:");
        System.out.println("0. Iced");
        System.out.println("1. Hot");
        System.out.println("2. Extra Hot");
        System.out.println("Enter a number  0-2");
        int tempIndex = kb.nextInt();

        System.out.println("Choose milk type for your coffee:");
        System.out.println("0. None");
        System.out.println("1. Whole");
        System.out.println("2. Skim");
        System.out.println("3. Oat");
        System.out.println("4. Almond");
        System.out.println("Enter a number  0-4");
        int milkIndex = kb.nextInt();

        System.out.println("Choose the amount of espresso shots:");
        System.out.println("0. Zero shots");
        System.out.println("1. One shot");
        System.out.println("2. Two shots");
        System.out.println("3. Three shots");
        System.out.println("Enter a number  0-3");
        int espressoIndex = kb.nextInt();

        System.out.println("Choose sweetener type:");
        System.out.println("0. None");
        System.out.println("1. Raw sugar");
        System.out.println("2. Honey");
        System.out.println("3. Maple Syrup");
        System.out.println("4. Vanilla Syrup");
        System.out.println("Enter a number  0-4");
        int sweetenerIndex = kb.nextInt();

        System.out.println("Would you like foam?");
        System.out.println("0. Yes");
        System.out.println("1. No");
        System.out.println("Enter a number  0-1");
        int foamIndex = kb.nextInt();

        Coffee coffee = new Coffee(sizeIndex,baseIndex, tempIndex, milkIndex, espressoIndex, sweetenerIndex, foamIndex);

        System.out.println("You have ordered a drink!");
        Files.recordToFile(coffee.toString());

        afterOrder();
    }

    /*
     * Handles the process of ordering a tea with all the user choices and then creates 
     * the tea object and saves to file. Calls next menu.
     * 
     * Preconditions:
     * - The user must enter valid indices for each customization option
     * 
     * Postconditions:
     * - A Tea object is created with the specified attributes.
     * - The order is saved to the file "order.txt"
     * - The user is prompted with the affter-order menu.
     * 
     */
    public void orderTea() {
        System.out.println("Let's customize your tea!");

        System.out.println("Choose tea size:");
        System.out.println("0. Small");
        System.out.println("1. Medium");
        System.out.println("2. Large");
        System.out.println("3. Extra Large");
        System.out.println("Enter a number 0-3");
        int sizeIndex = kb.nextInt();

        System.out.println("Choose tea type:");
        System.out.println("0. Black Tea");
        System.out.println("1. Green Tea");
        System.out.println("2. Herbal Tea");
        System.out.println("3. Oolong Tea");
        System.out.println("4. Matcha Tea");
        System.out.println("Enter a number 0-4");
        int typeIndex = kb.nextInt();

        System.out.println("Choose tea temperature:");
        System.out.println("0. Iced");
        System.out.println("1. Hot");
        System.out.println("2. Extra Hot");
        System.out.println("Enter a number 0-2");
        int tempIndex = kb.nextInt();

        System.out.println("Choose milk type for your tea:");
        System.out.println("0. None");
        System.out.println("1. Whole");
        System.out.println("2. Skim");
        System.out.println("3. Oat");
        System.out.println("4. Almond");
        System.out.println("Enter a number 0-4");
        int milkIndex = kb.nextInt();

        System.out.println("Would you like lemon?");
        System.out.println("0. Yes");
        System.out.println("1. No");
        System.out.println("Enter a number 0-1");
        int lemonIndex = kb.nextInt();

        System.out.println("Choose sweetener type:");
        System.out.println("0. None");
        System.out.println("1. Raw Sugar");
        System.out.println("2. Honey");
        System.out.println("3. Maple Syrup");
        System.out.println("4. Stevia");

        System.out.println("Enter a number 0-4");
        int sweetenerIndex = kb.nextInt();

        Tea tea = new Tea(sizeIndex, typeIndex, milkIndex, lemonIndex == 0, sweetenerIndex, tempIndex);

        System.out.println("You have ordered a drink!");
        Files.recordToFile(tea.toString());

        afterOrder();
    }

    /*
     * Prints out the menu for the available options for tea and coffee.
     */
    public void seeOptions() {
        System.out.println("Options for Coffee:");
        System.out.println("Sizes: Small, Medium, Large");
        System.out.println("Bases: Espresso, Cappuccino, Latte, Mocha, Frappe");
        System.out.println("Temperatures: Iced, Hot, Extra Hot");
        System.out.println("Milk Types: None, Whole, Skim, Oat, Almond");
        System.out.println("Espresso Shots: 0, 1, 2, 3");
        System.out.println("Sweeteners: None, Raw Sugar, Honey, Maple Syrup, Vanilla Syrup");
        System.out.println("Foam: Yes, No");
        System.out.println();
        System.out.println("Options for Tea:");
        System.out.println("Sizes: Small, Medium, Large, Extra Large");
        System.out.println("Types: Black Tea, Green Tea, Herbal Tea, Oolong Tea, Matcha Tea");
        System.out.println("Temperatures: Iced, Hot, Extra Hot");
        System.out.println("Milk Types: None, Whole, Skim, Oat, Almond");
        System.out.println("Sweeteners: None, Raw Sugar, Honey, Maple Syrup, Stevia");
        System.out.println("Lemon: Yes, No");
        System.out.println();

        System.exit(0);
        chooseDrink();
    }

    /*
     * Handles the checkout process, allowing the user to choose where to have their order.
     * The final method after which program stops with code 0.
     * 
     * Preconditions:
     * - The user must enter a valid inputs
     * 
     * Postconditions:
     * - The user's order details are displayed.
     * - The user is prompted to specify a pickup time if choosing to pick up at a café.
     * - The program terminates after checkout.
     */
    public void checkout() {
    System.out.println("Please choose where you would like to have this order:");
    System.out.println("1. Nearby café");
    System.out.println("2. At home");

    int choice = -1;
    while (choice == -1) {
        try {
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    String time = pickupTime();
                    System.out.println("Here are your order details: ");
                    Files.displayFromFile();
                    System.out.println();
                    System.out.println("Order should be picked up at the neighboring café at " + time);
                    System.out.println("Thank you for using this application!");
                    Files.clearFile();
                    // Exit the program after checkout
                    System.exit(0);
                case 2:
                    System.out.println("Here are your order details: ");
                    Files.displayFromFile();
                    System.out.println();
                    System.out.println("You can make this order with that magic coffee maker of yours at home.");
                    System.out.println("Thank you for using this application!");
                    Files.clearFile();
                    //System.exit(0); // Exit the program after checkout
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    choice = -1; // Reset choice to loop again
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number!");
            kb.nextLine(); // Clear the invalid input
            choice = -1; // Reset choice to loop again
        }
    }
}

    /*
     * Helper method for the chechout to specify pickup time if user chose cafe.
     * 
     * @returns formatted time, which is a String in the format that we need
     * 
     * Preconditions:
     * - The user must enter a valid time in HHMM format (0000 to 2359).
     */
    public String pickupTime() {
    System.out.println("Please specify pick-up time:");
    System.out.println("Enter in HHMM format. For example, 07:35 would correspond to 0735; 17:05 to 1705");

    String formattedTime = null;

    while (formattedTime == null) {
        try {
            int choice = kb.nextInt();

            if (choice >= 0 && choice <= 2359) {
                int hours = choice / 100;
                int minutes = choice % 100;

                if (minutes < 60) {
                    formattedTime = String.format("%02d:%02d", hours, minutes);
                } else {
                    System.out.println("Invalid time format. Minutes must be between 00 and 59.");
                }
            } else {
                System.out.println("Invalid time. Please enter a number between 0000 and 2359.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number in HHMM format!");
            kb.nextLine(); // Clear the invalid input
        }
    }

    return formattedTime;
}

    /*
     * Displays the after-order menu, allowing the user to review their order, add another drink, or proceed to checkout.
     * Apears each time a drink is added.
     * 
     * Preconditions:
     * - The user must enter a valid input
     * 
     * Postconditions:
     * - The user's choice is proccessed, and the appropriate action is takena
     */
    public void afterOrder() {

        System.out.println("\nChoose from the following");
        System.out.println("1. See your ordered drinks so far.");
        System.out.println("2. Add another drink");
        System.out.println("3. Checkout (specify where you want this drink)");

        int choice = -1;
        while(choice == -1) {
            try {
                choice = kb.nextInt();
                switch (choice) {
                    case 1:
                        Files.displayFromFile();
                        afterOrder();
                        break;
                    case 2:
                        chooseDrink();
                        //kb.nextLine();
                        break;
                    case 3:
                        checkout();
                        break;
                    default:
                        System.out.println("Please choose from 1 - 3");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number!");
                kb.nextLine();
                choice = -1;
            }
        }
    }

}
