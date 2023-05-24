// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan2;

public class PascaSarjana extends Mahasiswa implements ICumlaude {
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
}
