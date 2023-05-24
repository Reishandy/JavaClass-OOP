// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan3;

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

    public void giveMawapresCertificate(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi");

        mahasiswa.winningCompetition();
        mahasiswa.publishIlmiah();

        System.out.println("--------------------------------------------");
    }
}
