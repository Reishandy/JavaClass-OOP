package inheritence.percobaan2;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        StaffTetap staffTetap = new StaffTetap("Budi", "Malang", "Laki-laki",
                20, 2_000_000, 200_000, 250_000, "2A", 100_000);
        staffTetap.showStaffTetap();
        System.out.println();

        StaffHarian staffHarian = new StaffHarian("Indah", "Malang", "Perempuan",
                27, 10_000, 100_000, 50_000, 100);
        staffHarian.showStaffHarian();
    }
}