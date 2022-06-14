/**
 * @author Aaron L. Keys
 */
package state;

public class InTransitState extends State {
    /**
     * Class variables
     */
    private int days;
    private Package pkg;
    private int quantity;
    /**
     * This is the constructor method for the in-transit state.
     * @param pkg is the Package that will be shipped to the customer.
     * @param quantity is the number of that package being shipped.
     */
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
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
        return "The " + pkg.getName() + " " + verb + " out for delivery";
    }
    /**
     * This method returns the estimated time of arrival.
     * @return a String with the correct estimated time, related
     * to the package's name and the verb, which is dependent upon the
     * quantity of items shipped.
     */
    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + 
               days + " days";
    }
    /**
     * This method returns whether there has been a delay in the shipment.
     * @return a String that displays the estimated delay, which in this case
     * has experienced a delay.
     */
    public String delay() {
        String verb = getVerb("has", "have");
        days += 3;
        return "The " + pkg.getName() + " " + verb + " experienced a delay in shipping" +
               "\n" + getETA();
    }
}
