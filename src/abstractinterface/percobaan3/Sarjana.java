// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan3;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public Sarjana(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void getHighIPK() {
        System.out.println("IPK-ku lebih tinggi dari 3,51");
    }

    @Override
    public void winningCompetition() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void publishIlmiah() {
        System.out.println("Saya telah menerbitkan artikel di jurnal NASIONAL");
    }
}
