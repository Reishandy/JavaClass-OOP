// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan2;

public class Main {
    public static void main(String[] args) {
        Rektor rektor = new Rektor();

        // Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // rektor.giveCumlaudeCertificate(mahasiswaBiasa);
        rektor.giveCumlaudeCertificate(sarjanaCumlaude);
        rektor.giveCumlaudeCertificate(masterCumlaude);
    }
}
