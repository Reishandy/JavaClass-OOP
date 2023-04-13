/*
 * All original
 * Author: Reishandy
 * Java: JDK 20
 */
package kuis.barrack;
import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private final ArrayList<TakeOut> takeOutList;
    private int totalTakeOut;

    public Warehouse() {
        takeOutList = new ArrayList<>();
        totalTakeOut = 0;
    }

    public void addTakeOut(TakeOut takeOut) {
        takeOutList.add(takeOut);
    }
    private void getTotalFromList() {
        totalTakeOut = takeOutList.size();
    }
    public int getTotalTakeOut() {
        getTotalFromList();
        return totalTakeOut;
    }

    public void printAllHistory() {
        getTotalFromList();
        System.out.println("--------------------");
        System.out.printf("Current Total: %d\n", totalTakeOut);
        System.out.println("--------------------");

        for (TakeOut takeOut: takeOutList) {
            System.out.printf("""
                    Name: %s
                    Date Out: %s
                    Date In: %s
                    Condition: %s
                    """,
                    takeOut.getName(), takeOut.getDateOut(), takeOut.getDateInEst(),
                    (takeOut.getCondition()) ? "Good" : "Problem (needs checking)");

            System.out.println("Weapon: ");
            HashMap<String, Integer> weapon = takeOut.getWeapons();
            for (String name: weapon.keySet()) {
                System.out.printf("  %s (%d)\n", name, weapon.get(name));
            }
            System.out.println("Ammo: ");
            HashMap<String, Integer> ammo = takeOut.getAmmos();
            for (String type: ammo.keySet()) {
                System.out.printf("  %s (%d)\n", type, ammo.get(type));
            }
            System.out.println("--------------------");
        }
    }
}
