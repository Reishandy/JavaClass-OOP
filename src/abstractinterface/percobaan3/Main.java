// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan3;

public class Main {
    public static void main(String[] args) {
        Rektor rektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // TODO: comment sarjana for number 6 then uncomment for number 7
        rektor.giveMawapresCertificate(sarjanaCumlaude);
        rektor.giveMawapresCertificate(masterCumlaude);
    }
}
