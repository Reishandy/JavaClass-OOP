// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan3;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public PascaSarjana(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void getHighIPK() {
        System.out.println("IPK-ku lebih tinggi dari 3,71");
    }

    @Override
    public void winningCompetition() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void publishIlmiah() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
