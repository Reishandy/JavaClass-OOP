// Author: Muhammad Akbar Reishandy
package uts;

import uts.pegawai.Dosen;
import uts.pegawai.TenagaPendidikan;

import java.util.HashMap;

public class Kepegawaian {
    // Ini memakai nama dan gaji
    // sebenarnya bisa pakai NIP
    private final HashMap<String, Integer> daftarGaji;

    public Kepegawaian() {
        this.daftarGaji = new HashMap<>();
    }

    public void add(Dosen dosen) {
        daftarGaji.put(dosen.getName(), dosen.getGaji());
    }

    public void add(TenagaPendidikan tenagaPendidikan) {
        daftarGaji.put(tenagaPendidikan.getName(), tenagaPendidikan.getGaji());
    }

    public void printList() {
        daftarGaji.forEach(
                (key, value)
                        -> System.out.printf("%s: Rp %,d\n", key, value)
        );
    }

    public void method() {
    }
}
