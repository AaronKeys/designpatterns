/**
 * @author Aaron L. Keys
 */
package decorator;

public class Strawberry extends ScoopDecorator {
    /**
     * The constructor passes the parameters to the parent class in order
     * to further manipulate the ScoopeDecorator methods and change the
     * cost and description.
     * @param iceCream is a type of icecream determined by input from the
     * driver class.
     * @param numScoops is the number of scoops of ice cream that are on
     * the ice cream, whether that's in a cone or a bowl.
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4;
    }
    /**
     * @return the display the type of icecream and number of scoops of
     * aforementioned icecream.
     */
    public String toString() {
        if(this.numScoops == 1) {
            return iceCream.toString() + "a scoop of " + flavor + " ice cream";
        } else {
            return iceCream.toString() + numScoops + " scoops of " + flavor + " ice cream";
        }
    }
    /**
     * @return the cost of the icecream with the cost of the number
     * of scoops that have been added.
     */
    public double getCost() {
        return iceCream.getCost() + flavorCost * numScoops;
    }
}
