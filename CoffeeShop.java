import java.util.*;

/**
 * This is the menu class that runs the coffee shop application.
 *
 * @author Emmy
 * @version 1
 * 
 * Preconditions:
 * - The Menu class must be properly implemented.
 * 
 * Postconditions:
 * - The program runs smoothly.
 */
public class CoffeeShop
{

    /*
     * The main method that starts the coffee shop application. Exceptions are handled as needed.
     * 
     */
    public static void main(String[] args) {
        Files.clearFile(); //clearing file in case it has previous orders
        Menu menu = new Menu();
        Scanner kb = new Scanner(System.in);
        System.out.println("\nWelcome to your coffee application!");
        System.out.println("Let's help you decide what drink(s) you want and how you will be having them.\n");

        int input;
        menu.chooseDrink();
        do {

            try {
                input = kb.nextInt();
                switch(input) {
                    case 1:
                        menu.orderCoffee();
                        break;
                    case 2:
                        menu.orderTea();
                        break;
                    case 3:
                        menu.seeOptions();
                        break;
                    default:
                        System.out.println("Enter numbers 1 - 3");
                }
                
            //Should trigger if user enters number outside of coffee/tea array bounds
            } catch(ArrayIndexOutOfBoundsException e) { 
                System.out.println("Entered a number not within the selection! Please try again.");
                kb.nextLine();  //important
                menu.chooseDrink(); 
            } 

            //Mostly, for InputMismatchException
            catch(Exception e) {
                System.out.println("Invalid input! Order couldn't be added, please select valid input.");
                kb.nextLine(); //important
            }

        } while(true);
    }
}
