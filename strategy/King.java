/**
 * @author Aaron L. Keys
 */
package strategy;

public class King extends Character {
    /**
     * @param name is the name of the King
     */
    public King(String name) {
        super(name);
        weaponBehavior = new WeaponSword();
    }
    
    /**
     * @return The name and type of character.
     */
    public String toString() {
        return this.name + " is a Noble King";
    }
}