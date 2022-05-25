/**
 * @author Aaron L. Keys
 */
package factory;

public class WoodAnimalPuzzle extends Puzzle {
    /**
     * This constructor method adds values to pieces and prints out the set
     * related to it.
     */
    public WoodAnimalPuzzle() {
        String result = "";
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces.add("Horse");
        this.pieces.add("Sheep");
        this.pieces.add("Dog");
        this.pieces.add("Cat");
        this.pieces.add("Cow");
        this.pieces.add("Chicken");
        System.out.println("This puzzle is a made out of " + this.material);
        System.out.println("Adding the following pieces");

        for(String piece: pieces) {
            result += "-  " + piece + "\n";
        }
        System.out.print(result);
    }
}
