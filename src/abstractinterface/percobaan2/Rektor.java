// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan2;

public class Rektor {
    // I'm using overloading for this...
    public void giveCumlaudeCertificate(Sarjana mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri anda..");

        mahasiswa.studyOnCampus();
        mahasiswa.graduate();
        mahasiswa.getHighIPK();

        System.out.println("--------------------------------------------");
    }

    public void giveCumlaudeCertificate(PascaSarjana mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri anda..");

        mahasiswa.studyOnCampus();
        mahasiswa.graduate();
        mahasiswa.getHighIPK();

        System.out.println("--------------------------------------------");
    }
}
