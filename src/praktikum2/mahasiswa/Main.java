package praktikum2.mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = 101;
        mhs.nama = "Lestari";
        mhs.alamat = "Jl. Vinolia No 1A";
        mhs.kelas = "1A";
        mhs.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Aji";
        mhs2.alamat = "Jl. Kucing No 11";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs2.nim = 103;
        mhs2.nama = "Mijuruki";
        mhs2.alamat = "Jl. Anjing No 12";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();

    }
}