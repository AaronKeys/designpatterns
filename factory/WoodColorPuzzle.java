/**
 * @author Aaron L. Keys
 */
package factory;

public class WoodColorPuzzle extends Puzzle {
    /**
     * This constructor method adds values to pieces and prints out the set
     * related to it.
     */
    public WoodColorPuzzle() {
        String result = "";
        this.name = "Color Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces.add("Red Fish");
        this.pieces.add("Yellow Fish");
        this.pieces.add("Green Fish");
        this.pieces.add("Purple Fish");
        this.pieces.add("Pink Fish");
        this.pieces.add("Orange Fish");
        this.pieces.add("Brown Fish");
        this.pieces.add("White Fish");
        this.pieces.add("Black Fish");
        System.out.println("This puzzle is a made out of " + this.material);
        System.out.println("Adding the following pieces");

        for(String piece: pieces) {
            result += "-  " + piece + "\n";
        }
        System.out.print(result);
    }
}
