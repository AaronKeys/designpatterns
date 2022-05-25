/**
 * @author Aaron L. Keys
 */
package strategy;

public class Knight extends Character {
    /**
     * @param name is the name of the Knight
     */
    public Knight(String name) {
        super(name);
        weaponBehavior = new WeaponBow();
    }

    /**
     * @return The name and type of character.
     */
    public String toString() {
        return this.name + " is a valiant knight";
    }
}
