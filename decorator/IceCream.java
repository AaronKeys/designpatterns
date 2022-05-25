/**
 * @author Aaron L. Keys
 */
package decorator;

public abstract class IceCream {
    /**
     * Declaring multi-class variables
     */
    protected String description;
    protected double cost;
    /**
     * @return the description of the type of icecream.
     */
    public String toString() {
        return description;
    }
    /**
     * @return the price/cost of the icecream.
     */
    public abstract double getCost();
}