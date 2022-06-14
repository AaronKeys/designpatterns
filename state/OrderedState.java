/**
 * @author Aaron L. Keys
 */
package state;

public class OrderedState extends State {
    /**
     * Class variables
     */
    private int days;
    private Package pkg;
    private int quantity;
    /**
     * This is the constructor method for the Ordered state.
     * @param pkg is the Package that will be shipped to the customer.
     * @param quantity is the number of that package being shipped.
     */
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 2;
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
        //display is different on the output.txt but this is what is shows on the website.
        String verb = getVerb("was", "were"); 
        return "The " + pkg.getName() + " " + verb + " ordered";
    }
    /**
     * This method returns the estimated time of arrival.
     * @return a String with the correct estimated time, related
     * to the package's name and the verb, which is dependent upon the
     * quantity of items shipped.
     */
    public String getETA() {
        return "The " + pkg.getName() + " will be shipped within " + 
        days + " business days.";
    }
    /**
     * This method returns whether there has been a delay in the shipment.
     * @return a String that displays the estimated delay, which in this case
     * has already been delivered.
     */
    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing."
               + "\n" + getETA();
    }
}
