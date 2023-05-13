// Author: Muhammad Akbar Reishandy
package overloadoverride.percobaan1;

public class Karyawan {
    private String nama, nip, golongan;
    private double gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        switch (golongan.charAt(0)) {
            case '1' -> this.gaji = 5_000_000;
            case '2' -> this.gaji = 3_000_000;
            case '3' -> this.gaji = 2_000_000;
            case '4' -> this.gaji = 1_000_000;
            case '5' -> this.gaji = 750_000;
        }
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getGolongan() {
        return golongan;
    }

    public double getGaji() {
        return gaji;
    }
}
