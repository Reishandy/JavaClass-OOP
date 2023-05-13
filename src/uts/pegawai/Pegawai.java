// Author: Muhammad Akbar Reishandy
package uts.pegawai;

public class Pegawai {
    private final String name, NIP, gender;
    private final int gaji, age;

    public Pegawai(String name, String NIP, String gender, int age) {
        this.name = name;
        this.NIP = NIP;
        this.gender = gender;
        this.age = age;
        this.gaji = 1_300_000; // Set gaji standar UNIWARA
    }

    public int getGaji() {
        return this.gaji;
    }

    public String getName() {
        return name;
    }

    public void printData() {
        System.out.printf("""
                NIP     : %s
                Nama    : %s
                Gender  : %s
                Umur    : %s
                Gaji P. : Rp %,d
                """, name, NIP, gender, age, gaji);
    }
}
