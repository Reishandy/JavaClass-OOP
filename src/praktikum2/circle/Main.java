package praktikum2.circle;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;
        lingkaran.phi = Math.PI;
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.printf("""
                Luas lingkaran: %.2f
                Keliling lingkaran: %.2f
                """,
                luas, keliling
        );
    }
}
