// Author: Muhammad Akbar Reishandy
package uts.pegawai;

public class Dosen extends Pegawai {
    private final int sks, gajiSks;

    public Dosen(String name, String NIP, String gender, int age, int sks) {
        super(name, NIP, gender, age);
        this.sks = sks;
        // Langsung set gaji yang akan ditambahan per sks standar 50_000
        // Tidak perlu diganti karena tidak digunakan di luar program ini
        this.gajiSks = 50_000;
    }

    @Override
    public int getGaji() {
        return super.getGaji() + (sks * gajiSks);
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("""
                SKS     : %d
                Gaji T. : Rp %,d
                """, sks, this.getGaji());
    }
}
