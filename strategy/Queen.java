/**
 * @author Aaron L. Keys
 */
package strategy;

public class Queen extends Character {
    /**
     * @param name is the name of the Queen
     */
    public Queen(String name) {
        super(name);
        weaponBehavior = new WeaponKnife();
    }

    /**
     * @return The name and type of character.
     */
    public String toString() {
        return this.name + " is a beautiful queen";
    }
}
