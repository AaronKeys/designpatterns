/**
 * @author Aaron L. Keys
 */
package strategy;

public class WeaponAxe implements WeaponBehavior {
    /**
     * @return The weapon attack type for Axe.
     */
    public String attack() {
        //Randomly returns one of possible strings
        String twirl = "Twirl with an axe";
        String swing = "Swing an axe";
        int low = 1;
        int high = 2;
        int rndm = (int)(Math.random() * (high - low + 1) + low);
        if (rndm == low) {
            return twirl;
        } else {
            return swing;
        }
    }
}
