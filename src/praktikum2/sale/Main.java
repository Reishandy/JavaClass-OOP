package praktikum2.sale;

public class Main {
    public static void main(String[] args) {
        Barang ps5 = new Barang(
                "PS5",
                "PlayStation 5",
                8_199_000,
                0.1F
        );      // Diskon 10%

        Barang pixel3XL = new Barang(
                "GP3XL",
                "Google pixel 3XL",
                1_450_000,
                0.15F
        );      // Diskon 15%

        ps5.tampilData();
        System.out.println();
        pixel3XL.tampilData();
    }
}
