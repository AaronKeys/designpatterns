/**
 * @author Aaron L. Keys
 */
package strategy;

public class WeaponSword implements WeaponBehavior{
    /**
     * @return The weapon attack type for Sword.
     */ 
    public String attack() {
        //Randomly returns one of possible strings
        String lunge = "Lunge and strike with sword";
        String turnSlice = "Fancy turn and slice with sword";
        String jam = "Jam opponents blade with sword";
        int low = 1;
        int high = 3;
        int rndm = (int)(Math.random() * (high - low + 1) + low);
        
        if (rndm == low) {
            return lunge;
        } else if (rndm == high) {
            return turnSlice;
        } else {
            return jam;
        }
    }
}
