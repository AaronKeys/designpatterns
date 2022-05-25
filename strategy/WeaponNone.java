/**
 * @author Aaron L. Keys
 */
package strategy;

public class WeaponNone implements WeaponBehavior {
    /**
     * @return The weapon attack type for no weapon.
     */    
    public String attack() {
        //Randomly returns one of possible strings
        String ohNo = "Oh no! I lost my weapon";
        String noWeapon = "No one let's me have a weapon";
        int low = 1;
        int high = 2;
        int rndm = (int)(Math.random() * (high - low + 1) + low);
        if (rndm == low) {
            return ohNo;
        } else {
            return noWeapon;
        }
    }
}
