/*
 * All original
 * Author: Reishandy
 * Java: JDK 20
 */
package kuis.barrack;
public class Main {
    public static void main(String[] args) {
        TakeOut takeOut1 = new TakeOut(
                "13/04/23", "15/04/23", "Reishandy");
        takeOut1.addWeapon("M4A1", 2);
        takeOut1.addAmmo("5.56", 160);
        takeOut1.setCondition(true);

        TakeOut takeOut2 = new TakeOut(
                "11/04/23", "18/04/23", "Kucing");
        takeOut2.addWeapon("AK-47", 1);
        takeOut2.addWeapon("AK-12", 3);
        takeOut2.addWeapon("AK-74M", 1);
        takeOut2.addAmmo("7.39", 700);
        takeOut2.setCondition(false);

        TakeOut takeOut3 = new TakeOut(
                "10/04/23", "11/04/23", "Ayam Goreng");
        takeOut3.addWeapon("FN VAL", 1);
        takeOut3.addAmmo("7.62", 120);
        takeOut3.addAmmo("5.56", 200);

        Warehouse warehouse = new Warehouse();
        warehouse.addTakeOut(takeOut1);
        warehouse.addTakeOut(takeOut2);
        warehouse.addTakeOut(takeOut3);

        System.out.printf("Warehouse 1 total takeout: %s\n", warehouse.getTotalTakeOut());
        System.out.println("Printing History... \n");
        warehouse.printAllHistory();
    }
}
