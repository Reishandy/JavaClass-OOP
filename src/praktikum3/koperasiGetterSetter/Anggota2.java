package praktikum3.koperasiGetterSetter;

public class Anggota2 {
    private String nama;
    private String amalat;
    private float simpanan;

    public Anggota2(String nama, String amalat) {
        this.nama = nama;
        this.amalat = amalat;
        this.simpanan = 0;
    }

    public String getNama() {
        return nama;
    }
    public String getAmalat() {
        return amalat;
    } // Tidak digunakan ＞﹏＜
    public float getSimpanan() {
        return simpanan;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAmalat(String amalat) {
        this.amalat = amalat;
    }
    public void setor(float uang) {
        simpanan += uang;
    }
    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
