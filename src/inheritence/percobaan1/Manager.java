package inheritence.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Manager extends Employee{
    public int tunjangan;
    public Manager() {
    }

    public void showManagerData() {
        super.showEmployeeData();
        System.out.printf("""
                Tunjangan       : Rp %,d
                Total gaji      : Rp %,d
                """, tunjangan,
                (super.salary + tunjangan));
    }
}
