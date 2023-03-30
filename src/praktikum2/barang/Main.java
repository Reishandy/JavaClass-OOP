package praktikum2.barang;

public class Main {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.namaBrg = "pensil";
        brg.jenisBrg = "ATK";
        brg.stok = 10;
        brg.tampilBarang();
        System.out.printf(
                "Stok baru adalah: %d",
                brg.tambahStok(20)
                );
    }
}
