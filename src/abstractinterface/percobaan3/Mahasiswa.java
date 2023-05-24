// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan3;

public class Mahasiswa {
    protected String name;

    public Mahasiswa(String name) {
        this.name = name;
    }

    public void studyOnCampus() {
        System.out.printf("""
                Aku mahasiswa, namaku %s
                Aku berkuliah di kampus.
                """, name);
    }
}
