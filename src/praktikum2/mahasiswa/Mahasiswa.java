package praktikum2.mahasiswa;

public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;

    public void tampilBiodata() {
        System.out.printf("""
                Nim: %d
                Nama: %s
                Alamat: %s
                Kelas: %s
                """, nim, nama,alamat,kelas
        );
    }
}
