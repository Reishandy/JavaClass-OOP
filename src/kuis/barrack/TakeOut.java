/*
 * All original
 * Author: Reishandy
 * Java: JDK 20
 */
package kuis.barrack;
import java.util.HashMap;
public class TakeOut {
    private final String dateOut;
    private final String dateInEst;
    private final String name;
    private final HashMap<String, Integer> weapons;
    private final HashMap<String, Integer> ammos;
    private boolean condition;

    public TakeOut(String dateOut, String dateInEst, String name) {
        this.dateOut = dateOut;
        this.dateInEst = dateInEst;
        this.name = name;
        this.weapons = new HashMap<>();
        this.ammos = new HashMap<>();
    }

    public void addWeapon(String name, int amount) {
        weapons.put(name, amount);
    }
    public void addAmmo(String type, int amount) {
        ammos.put(type, amount);
    }
    public void setCondition(boolean condition) {
        this.condition = condition;
    }
    public String getDateOut() {
        return dateOut;
    }
    public String getDateInEst() {
        return dateInEst;
    }
    public String getName() {
        return name;
    }
    public HashMap<String, Integer> getWeapons() {
        return weapons;
    }
    public HashMap<String, Integer> getAmmos() {
        return ammos;
    }
    public boolean getCondition() {
        return condition;
    }
}
