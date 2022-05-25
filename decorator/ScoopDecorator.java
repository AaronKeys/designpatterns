/**
 * @author Aaron L. Keys
 */
package decorator;

public class ScoopDecorator extends IceCream {

    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;

    }

    public String toString() {
        return ", " + numScoops + " scoops of " + flavor + " ice cream";
    }

    public double getCost() {
        this.cost = cost + (iceCream.cost * numScoops);
        return cost;
    }
}
