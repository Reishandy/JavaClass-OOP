package inheritence.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Staff extends Employee{
    public int lembur, potongan;
    public Staff() {
    }

    public Staff(String name, String address, String gender, int age, int salary, int lembur, int potongan) {
        super(name, address, gender, age, salary);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void showStaffData() {
        super.showEmployeeData();
        System.out.printf("""
                Lembur          : Rp %,d
                Potongan        : Rp %,d
                Total gaji      : Rp %,d
                """, lembur, potongan,
                (super.salary + lembur - potongan));
    }
}
