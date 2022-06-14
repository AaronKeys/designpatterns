/**
 * @author Aaron L. Keys
 */
package state;

public class DeliveredState extends State {
    /**
     * Class variables
     */
    private Package pkg;
    private int quantity;
    /**
     * This is the constructor method for the delivered state.
     * @param pkg is the Package that will be shipped to the customer.
     * @param quantity is the number of that package being shipped.
     */
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.pkg = pkg;
        this.quantity = quantity;
    }
    /**
     * This method returns whether the package has been delivered,
     * is in transit, or there has been a delay.
     * @return a String with the correct status related to the 
     * appropriate name of the package and verb attached to that name,
     * which is dependent upon the quantity of items shipped.
     */
    public String getStatus() {
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " here for you.";
    }
    /**
     * This method returns the estimated time of arrival.
     * @return a String with the correct estimated time, related
     * to the package's name and the verb, which is dependent upon the
     * quantity of items shipped.
     */
    public String getETA() {
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " here";
    }
    /**
     * This method returns whether there has been a delay in the shipment.
     * @return a String that displays the estimated delay, which in this case
     * has already been delivered.
     */
    public String delay() {
        String verb = getVerb("has", "have");
        return "The " + pkg.getName() + " " + verb + " already been delivered";
    }
}
