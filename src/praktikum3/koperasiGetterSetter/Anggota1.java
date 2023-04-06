package praktikum3.koperasiGetterSetter;

public class Anggota1 {
    private String nama;
    private String amalat;
    private float simpanan;

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
