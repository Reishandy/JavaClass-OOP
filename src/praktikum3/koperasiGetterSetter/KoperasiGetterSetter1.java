package praktikum3.koperasiGetterSetter;

public class KoperasiGetterSetter1 {
    public static void main(String[] args) {
        Anggota1 anggota = new Anggota1();

        anggota.setNama("Iwan Setiawan");
        anggota.setAmalat("Jl. Soekarno Hatta No.18");
        anggota.setor(100_000);
        System.out.printf("Simpanan %s: Rp %,.0f \n",
                anggota.getNama(), anggota.getSimpanan());
        anggota.pinjam(5_000);
        System.out.printf("Simpanan %s: Rp %,.0f \n",
                anggota.getNama(), anggota.getSimpanan());
    }
}
