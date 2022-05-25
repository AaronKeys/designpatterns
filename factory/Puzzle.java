/**
 * @author Aaron L. Keys
 */
package factory;

import java.util.*;

public class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();
    /**
     * This method assembles the puzzle together based on
     * the type given.
     * @return the string to be displayed to the user based on
     * the original type given to it by the driver class.
     */
    public String assemble() { 
        String result = "";

        result += "Putting together a " + name + "\n" +
        "This puzzle is made out of  " + material + "\n" +
        "Adding the following pieces " + "\n";
        for(String piece: pieces) {
            result += piece + "\n";
        }
        return result;
    }
    /**
     * This method tells the user the name of the type of
     * puzzle box being created.
     * @return the String to display the puzzle box type.
     */
    public String boxPuzzle() {
        return "Putting the " + name + " in a box";
    }
}
