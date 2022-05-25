/**
 * @author Aaron L. Keys
 */
package factory;

public class PlasticColorPuzzle extends Puzzle {
    /**
     * This constructor method adds values to pieces and prints out the set
     * related to it.
     */
    public PlasticColorPuzzle() {
        String result = "";
        this.name = "Color Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces.add("Green Dog");
        this.pieces.add("Orange Dog");
        this.pieces.add("Red Dog");
        this.pieces.add("Blue Dog");
        this.pieces.add("Yellow Dog");
        this.pieces.add("Brown Dog");
        System.out.println("This puzzle is a made out of " + this.material);
        System.out.println("Adding the following pieces");
        
        for(String piece: pieces) {
            result += "-  " + piece + "\n";
        }
        System.out.print(result);
    }
}
