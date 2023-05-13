// Author: Muhammad Akbar Reishandy
package overloadoverride.percobaan1;

public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff[] st;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setStaff(Staff[] st) {
        this.st = st;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void viewStaff() {
        for (Staff staff: st) {
            staff.lihatInfo();
            System.out.println();
        }
    }

    public void lihatInfo() {
        System.out.printf("""
                Manager     : %s
                NIP         : %s
                Nama        : %s
                Golongan    : %s
                Tunjangan   : Rp %,.0f
                Gaji        : Rp %,.0f
                Bagian      : %s
                Staff       : \n
                """, getBagian(), getNip(), getNama(), getGolongan(),
                getTunjangan(), this.getGaji(), getBagian());

        // Saya tambahi viewStaff
        viewStaff();
    }

    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
