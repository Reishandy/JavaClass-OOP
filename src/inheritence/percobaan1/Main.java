package inheritence.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Vivin";
        manager.address = "Jl. Vinolia";
        manager.age = 25;
        manager.gender = "Perempuan";
        manager.salary = 3_000_000;
        manager.tunjangan = 1_000_000;
        manager.showManagerData();

        System.out.println();
        Staff staff = new Staff();
        staff.name = "Lestari";
        staff.address = "Malang";
        staff.age = 25;
        staff.gender = "Perempuan";
        staff.salary = 2_000_000;
        staff.lembur = 500_000;
        staff.potongan = 250_000;
        staff.showStaffData();
    }
}
