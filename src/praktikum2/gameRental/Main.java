package praktikum2.gameRental;

public class Main {
    public static void main(String[] args) {
        BorrowData dataKijang = new BorrowData(
                1022, 5_000,
                "Kijang Ahmad Avendi",
                "Kucing Adventure"
        );

        dataKijang.showdata();
        String kijangToPay = String.format("%,d", dataKijang.priveToPay(5));
        System.out.println("\nHarga yang harus dibayar setelah meminjam selama 5 hari");
        System.out.println(kijangToPay);
    }
}
