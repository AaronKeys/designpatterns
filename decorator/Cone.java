/**
 * @author Aaron L. Keys
 */
package decorator;

public class Cone extends IceCream {
    private ConeType coneType;
    /**
     * The constructor method takes the cone type and will change
     * the description of the icecream and will add the additional
     * cost of the cone type to the price of the icecream.
     * @param coneType is the type of the icecream cone
     * and will use that to determine the cost and description.
     */
    public Cone(ConeType coneType) {
        //Setting the cone type
        this.coneType = coneType;
        /**
         * Based on the cone type, changing the values of the
         * description and cost. For the description, the
         * string is being modified to look more presentable
         * when being displayed to the user.
         */
        if(this.coneType == ConeType.WAFFLE_CONE) {
            this.cost = cost + 1.2;
            this.description = ConeType.WAFFLE_CONE.toString().toLowerCase().replace('_', ' ');
        } else if (this.coneType == ConeType.SUGAR_CONE) {
            this.cost = cost + .75;
            this.description = ConeType.SUGAR_CONE.toString().toLowerCase().replace('_', ' ');

        } else if (this.coneType == ConeType.CHOCOLATE_DIPPED_CONE) {
            this.cost = cost + 1.5;
            this.description = ConeType.CHOCOLATE_DIPPED_CONE.toString().toLowerCase().replace('_', ' ');
        } else {
            this.cost = cost + 1.8;
            this.description = ConeType.PRETZEL_CONE.toString().toLowerCase().replace('_', ' ');
        }
        
    }
    /**
     * @return the description of the icecream cone.
     */
    public String toString() {
        return this.description + ", ";
    }
    /**
     * @return the price/cost of the icecream cone.
     */
    public double getCost() {
        return this.cost;
    }
}
