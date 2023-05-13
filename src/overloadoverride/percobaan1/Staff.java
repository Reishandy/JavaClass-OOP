// Author: Muhammad Akbar Reishandy
package overloadoverride.percobaan1;

public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public int getLembur() {
        return lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + (lembur * gajiLembur);
    }

    @Override
    public double getGaji() {
        return super.getGaji() + (lembur * gajiLembur);
    }

    public void lihatInfo() {
        System.out.printf("""
                    NIP         : %s
                    Nama        : %s
                    Golongan    : %s
                    Jml lembur  : %d
                    Gaji lembur : Rp %,.0f
                    Gaji        : Rp %,.0f
                """, getNip(), getNama(), getGolongan(),
                getLembur(), getGajiLembur(), this.getGaji());
    }
}
