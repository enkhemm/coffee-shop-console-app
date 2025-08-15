
/**
 * This class represents a coffee order with customizable attributes. It has options for size, base, 
 * temperature, milk type, espresso shots, sweetener, and foam.
 *
 * @author Emmy
 * @version 1
 * 
 * Preconditions:
 * - sizeIndex must be between 0 and 2 (inclusive).
 * - baseIndex must be between 0 and 4 (inclusive).
 * - tempIndex must be between 0 and 2 (inclusive).
 * - milkIndex must be between 0 and 4 (inclusive).
 * - espIndex must be between 0 and 3 (inclusive).
 * - sweetenerIndex must be between 0 and 4 (inclusive).
 * - foamIndex must be between 0 and 1 (inclusive).
 * 
 * Postconditions:
 * - An coffee object is created with the customizations chosen by user.
 * 
 */
public class Coffee
{
    
    private static final String[] sizeArr = {"Small", "Medium", "Large"};
    private static final String[] baseArr = {"Espresso", "Cappuccino", "Latte", "Mocha", "Frappe"};
    private static final String[] temperatureArr = {"Iced", "Hot", "Extra Hot"};
    private static final String[] milkArr = {"None", "Whole", "Skim", "Oat", "Almond"};
    private static final int[] espressoShotsArr = {0, 1, 2, 3};
    private static final String[] sweetenerArr = {"None", "Raw Sugar", "Honey", "Maple Syrup", "Vanilla Syrup"};
    // true = foam, false = no foam
    private static final boolean[] foamArr = {true, false}; 
    
    //To store selected option
    private String size;
    private String base;
    private String temp;
    private String milk;
    private int espresso;
    private String sweetener;
    private boolean foam;
    
    //Constructor
    public Coffee(int sizeIndex, int baseIndex, int tempIndex, int milkIndex, int espIndex, int sweetenerIndex, int foamIndex) {
        size = sizeArr[sizeIndex];
        base = baseArr[baseIndex];
        temp = temperatureArr[tempIndex];
        milk = milkArr[milkIndex];
        espresso = espressoShotsArr[espIndex];
        sweetener = sweetenerArr[sweetenerIndex];
        foam = foamArr[foamIndex];
    }

    //Overloaded toString converts to a format we need
    public String toString() {
        return temp + " " + size + " sized " + base + " with " + espresso + " shots of espresso. " +
                "With " + milk + " milk, " + sweetener + " and " + (foam ? "Extra" : "No") + " foam.";
    }

}
