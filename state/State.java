/**
 * @author Aaron L. Keys
 */
package state;

public abstract class State {
    /**
     * Class variables
     */
    private Package pkg; //could be deleted?
    private int quantity;

    /**
     * This is the constructor method for the State, which is used as a
     * base for the specific states of the package/s.
     * @param pkg is the Package that will be shipped to the customer.
     * @param quantity is the number of that package being shipped.
     */
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }
    /**
     * Gets the status
     * @return a String with the status
     */
    public abstract String getStatus();
    /**
     * gets the estimated time of arrival.
     * @return a String of the ETA
     */
    public abstract String getETA();
    /**
     * Get's the delay message for the package.
     * @return a String of the delay and added time.
     */
    public abstract String delay();
    /**
     * Determines whether to give the singular or plural for a state.
     * @param singular a String with the singular verb connected to the appropriate state.
     * @param plural a String with the plural verb connected to the appropriate state.
     * @return a String with either the singular or plural verb for the desired state.
     */
    protected String getVerb(String singular, String plural) {
        if(quantity == 1) {
            return singular;
        } else {
            return plural;
        }
    }
}
