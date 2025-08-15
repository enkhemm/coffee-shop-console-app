
/**
 * This class represents a tea order with customizable attributes. It has size, type, 
 * temperature, milk type, lemon, sweetener, and temperature.
 *
 * @author Emmy
 * @version 1

 * 
 * Preconditions:
 * - sizeIndex must be between 0 and 3 (inclusive).
 * - typeIndex must be between 0 and 4 (inclusive).
 * - milkIndex must be between 0 and 4 (inclusive).
 * - sweetenerIndex must be between 0 and 4 (inclusive).
 * - tempIndex must be between 0 and 2 (inclusive).
 *
 * Postconditions:
 * - A tea object is created with the customizations chosen by user.
 */

public class Tea {
    private static final String[] sizeArr = {"Small", "Medium", "Large", "Extra Large"};
    private static final String[] typeArr = {"Black Tea", "Green Tea", "Herbal Tea", "Oolong Tea", "Matcha Tea"};
    private static final String[] milkArr = {"None", "Whole", "Skim", "Oat", "Almond"};
    private static final String[] sweetenerArr = {"None", "Raw Sugar", "Honey", "Maple Syrup", "Stevia"};
    private static final String[] temperatureArr = {"Iced", "Hot", "Extra Hot"};

    //To store selected option
    private String size;
    private String type;
    private String milk;
    private boolean lemon;
    private String sweetener;
    private String temp;
    
    //Constructor
    public Tea(int sizeIndex, int typeIndex, int milkIndex, boolean lemon, int sweetenerIndex, int tempIndex) {
        this.size = sizeArr[sizeIndex];
        this.type = typeArr[typeIndex];
        this.milk = milkArr[milkIndex];
        this.lemon = lemon;
        this.sweetener = sweetenerArr[sweetenerIndex];
        this.temp = temperatureArr[tempIndex];
    }

    //Overloaded toString converts to a format we need
    public String toString() {
        return temp + " " + size + " sized " + type + " with " + milk + " milk, " +
                (lemon ? "with lemon" : "no lemon") + ", and " + sweetener + ".";
    }
}