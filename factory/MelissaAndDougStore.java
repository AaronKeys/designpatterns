/**
 * @author Aaron L. Keys
 */
package factory;

public class MelissaAndDougStore extends ToyStore {
    /**
     * This method creates a puzzle depending on the value given to it
     * by the driver class.
     * Otherwise null
     * @param type is the type of puzzle it will be (animal/color)
     * @return a puzzle based on the type given.
     */
    public Puzzle createPuzzle(String type) {
        String temp = type;
        if(temp.equals("color") == true) {
            System.out.println("Putting together a Color Puzzle by Melissa and Doug");
            return new WoodColorPuzzle();
        } else if(temp.equals("animal") == true) {
            System.out.println("Putting together a Animal Puzzle by Melissa and Doug");
            return new WoodAnimalPuzzle(); //null pointer
        } else {
            return null;
        }
    }
}
