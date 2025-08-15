import java.io.*;
import java.util.Scanner;
/**
 * This class handles file I/O operations for saving, displaying and clearing the orders from
 * the file.
 *
 * @author Emmy
 * @version 1
 * 
 * Preconditions:
 * - The file "order.txt" must be able to access for writing.
 * 
 * Postconditions:
 * - If the file does not exist, it is created.
 */
public class Files
{
    /*
     * Saves the given order to a file.
     * 
     * @param order The order
     */
    public static void recordToFile(String order) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("order.txt", true));
            pw.println(order);

            pw.close();
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }

    /*
     * Displays all orders from the file
     * 
     */
    public static void displayFromFile() {
        try (Scanner read = new Scanner(new FileInputStream(new File("order.txt")))) {
            System.out.println("\nCurrent Orders:");
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No previous orders found.");
        }
    }

    /*
     * Clears the file, ready for reuse in the next run.
     */
    public static void clearFile() {
        //This should overwrite the order.txt file with nothing ie clearing it
        try (PrintWriter pw = new PrintWriter(new FileWriter("order.txt"))) {
        // File is cleared when opened with FileWriter
        } catch (Exception e) {
            System.out.println("File not Found");
        }
    }


}
