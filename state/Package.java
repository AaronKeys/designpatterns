/**
 * @author Aaron L. Keys
 */
package state;

public class Package {
    /**
     * Class variables
     */
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * This is the constructor method for the Package.
     * @param pkg is the Package that will be shipped to the customer.
     * @param quantity is the number of that package being shipped.
     */
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.inTransitState = new InTransitState(this, quantity);
        this.deliveredState = new DeliveredState(this, quantity);
        this.orderedState = new OrderedState(this, quantity);
    }
    /**
     * Gives the state as ordered
     * @return a String of the status and eta
     */
    public String order() {
        this.state = orderedState;
        return state.getStatus() + " \n" + state.getETA();
    }
    /**
     * Gives the state as in transit
     * @return a String of the status and eta.
     */
    public String mail() {
        this.state = inTransitState;
        return state.getStatus() + " \n" + state.getETA();
    }
    /**
     * Gives the state as delivered
     * @return a String of the status.
     */
    public String received() {
        this.state = deliveredState;
        return state.getStatus();
    }
    /**
     * Gives a delay to the appropriate state
     * @return a String with the corresponding delay message.
     */
    public String delay() {
        return state.delay();
    }
    /**
     * Setting the state to the desired state
     * @param state is the type of state that is desired to be set.
     */
    public void setState(State state) {
        this.state = state;
    }
    /**
     * Gets the name of the package.
     * @return a String with the package name.
     */
    public String getName() {
        return name;
    }
}
