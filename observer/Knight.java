/**
 * @author Aaron L. Keys
 */
package observer;

public class Knight implements Observer {
    private Subject watchman;

    /**
     * Constructor method that takes a watchman class type uses it to
     * create an Observer data object variable of type Knight
     * @param watchman is passed to the registerObserver method, which is 
     * then added to our list of Observers.
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /**
     * This method is used to inform the user of what has transpired
     * after the warning has been sent.
     * @param warning is the integer number that will determine the number
     * of trumpets to play.
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else if (warning == 2) {
            System.out.println("Knight: Prepares for battle");
        } else {//Error message
            System.out.println("Unknown Warning.");
        }
    }
}
