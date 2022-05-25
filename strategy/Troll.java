/**
 * @author Aaron L. Keys
 */
package strategy;

public class Troll extends Character {
    /**
     * @param name is the name of the Troll
     */
    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();
    }

    /**
     * @return The name and type of character.
     */
    public String toString() {
        return this.name + " is a funny troll";
    }
}
