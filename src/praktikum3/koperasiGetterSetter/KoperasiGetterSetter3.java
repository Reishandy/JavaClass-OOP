package praktikum3.koperasiGetterSetter;

public class KoperasiGetterSetter3 {
    public static void main(String[] args) {
        Anggota2 anggota = new Anggota2("Iwan", "Jl. Mawar");
        System.out.printf("Simpanan %s: Rp %,.0f \n",
                anggota.getNama(), anggota.getSimpanan());

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
