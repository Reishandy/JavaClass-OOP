// Author: Muhammad Akbar Reishandy
package uts.pegawai;

public class TenagaPendidikan extends Pegawai {
    private final int kehadiran, gajiKehadiran;

    public TenagaPendidikan(String name, String NIP, String gender, int age, int kehadiran) {
        super(name, NIP, gender, age);
        this.kehadiran = kehadiran;
        // Langsung set gaji yang akan ditambahan per kehadiran standar 10_000
        // Tidak perlu diganti karena tidak digunakan di luar program ini
        this.gajiKehadiran = 10_000;
    }

    @Override
    public int getGaji() {
        return super.getGaji() + (kehadiran * gajiKehadiran);
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("""
                Kehadiran: %d
                Gaji T. : Rp %,d
                """, kehadiran, this.getGaji());
    }
}
