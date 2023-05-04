package inheritence.percobaan2;
import inheritence.percobaan1.*;
// Author: Muhammad Akbar Reishandy
public class StaffTetap extends Staff {
    public String golongan;
    public int asuransi;
    public StaffTetap() {
    }
    public StaffTetap(String name, String address, String gender,
                      int age, int salary, int lembur, int potongan, String golongan, int asuransi) {
        super(name, address, gender, age, salary, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void showStaffTetap() {
        System.out.println("=============== Data Staff Tetap ===============");
        super.showStaffData();
        System.out.printf("""
                Golongan        : %s
                Jumlah Asuransi : Rp %,d
                Gaji bersih     : Rp %,d
                """, golongan, asuransi,
                (salary + lembur - potongan - asuransi) );
    }
}
