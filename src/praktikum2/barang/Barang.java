package praktikum2.barang;

public class Barang {
        public String namaBrg;
        public String jenisBrg;
        public int stok;

        public void tampilBarang() {
            System.out.printf("""
                    Nama Barang  : %s
                    Jenis Barang : %s
                    Stok         : %d
                    """,
                    namaBrg,
                    jenisBrg,
                    stok
                    );
        }

        public int tambahStok(int brgMasuk) {
            int stokbaru = brgMasuk + stok;
            return stokbaru;
        }
}
