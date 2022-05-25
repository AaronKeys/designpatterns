/**
 * @author Aaron L. Keys
 */
package decorator;

public class Bowl extends IceCream {
    /**
     * Using the constructor method to set the value of description.
     */
    public Bowl() {
        this.description = "Bowl";
    }
    /**
     * @return the description of the type of icecream in the bowl.
     */
    public String toString() {
        return this.description + ",";
    }
    /**
     * @return the cost of the icecream in the bowl.
     */
    public double getCost() {
       return this.cost;
    }
}
