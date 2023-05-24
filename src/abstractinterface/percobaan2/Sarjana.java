// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan2;

public class Sarjana extends Mahasiswa implements ICumlaude {
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
}
