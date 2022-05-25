/**
 * @author Aaron L. Keys
 */
package factory;

public class PlasticAnimalPuzzle extends Puzzle {
    /**
     * This constructor method adds values to pieces and prints out the set
     * related to it.
     */    
    public PlasticAnimalPuzzle() {
        String result = "";
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces.add("Fox");
        this.pieces.add("Elephant");
        this.pieces.add("Giraffe");
        this.pieces.add("Owl");
        this.pieces.add("Monkey");
        System.out.println("This puzzle is a made out of " + this.material);
        System.out.println("Adding the following pieces");

        for(String piece: pieces) {
            result += "-  " + piece + "\n";
        }
        System.out.print(result);
    }
}
