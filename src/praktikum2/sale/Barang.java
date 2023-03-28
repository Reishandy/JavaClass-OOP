package praktikum2.sale;

public class Barang {
    // JDK 20
    // saya buat private karena tidak ada notasi di diagram
    private final String kode;
    private final String namaBarang;
    private final int hargaBarang;
    private final float diskon;

    public Barang(String kode, String namaBarang, int hargaBarang, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.diskon = diskon;
    }

    private int hitungHargaJual() {
        return (int) (hargaBarang - (diskon * hargaBarang));
    }

    public void tampilData() {
        System.out.printf("""
                Kode: %s
                Barang: %s
                Harga dasar: Rp %,d
                Diskon: %.0f%%
                Harga jual: Rp %,d
                """,
                kode, namaBarang,
                hargaBarang,
                diskon * 100,
                hitungHargaJual()
        );
    }
}
