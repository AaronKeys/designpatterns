/**
 * @author Aaron L. Keys
 */
package factory;

public class FisherPriceStore extends ToyStore {

    /**
     * This method creates a puzzle depending on the value given to it
     * by the driver class.
     * Otherwise null
     * @param type is the type of puzzle it will be (animal/color)
     * @return a puzzle based on the type given.
     */
    public Puzzle createPuzzle(String type) {
        if(type.equals("color")) {
            System.out.println("Putting together a Color Puzzle by Fisher Price");
            return new PlasticColorPuzzle();
        } else if(type.equals("animal")) {
            System.out.println("Putting together a Animal Puzzle by Fisher Price");
            return new PlasticAnimalPuzzle();
        } else {
            return null;
        }

    }
}
