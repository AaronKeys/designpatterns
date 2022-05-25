/**
 * @author Aaron L. Keys
 */
package observer;

public class ShopOwner implements Observer {

    private Subject watchman;
    /**
     * Constructor method that takes a watchman class type uses it to
     * create an Observer data object variable of type ShopOwner
     * @param watchman is passed to the registerObserver method, which is 
     * then added to our list of Observers.
     */
    public ShopOwner(Subject watchman) {
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
            System.out.println("ShopOwner: Close down shop and head home");
        } else if (warning == 2) {
            System.out.println("ShopOwner: Drops everything and find nearest hideout");
        } else {//Error message
            System.out.println("Unknown Warning.");
        }
    }
}
