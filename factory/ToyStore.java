/**
 * @author Aaron L. Keys
 */
package factory;

public abstract class ToyStore extends Puzzle {

    public String orderPuzzle(String type) {
        Puzzle puzzle = createPuzzle(type);
        puzzle.assemble();
        
        return puzzle.boxPuzzle();
    }

    public abstract Puzzle createPuzzle(String type);
}
