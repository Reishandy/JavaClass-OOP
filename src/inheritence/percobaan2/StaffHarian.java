package inheritence.percobaan2;
import inheritence.percobaan1.*;
// Author: Muhammad Akbar Reishandy
public class StaffHarian extends Staff {
    public int hours;
    public StaffHarian() {
    }
    public StaffHarian(String name, String address, String gender,
                       int age, int salary, int lembur, int potongan, int hours) {
        super(name, address, gender, age, salary, lembur, potongan);
        this.hours = hours;
    }

    public void showStaffHarian() {
        System.out.println("=============== Data Staff Harian ===============");
        super.showStaffData();
        System.out.printf("""
                Jam kerja       : %d
                Gaji bersih     : Rp %,d
                """, hours,
                (salary * hours + lembur - potongan) );
    }
}
