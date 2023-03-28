package praktikum2.gameRental;

public class BorrowData {
    // JDK 20
    private final int id;
    private final int price;
    private final String name;
    private final String game;

    public BorrowData(int id, int price, String name, String game) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.game = game;
    }

    public void showdata() {
        System.out.println("Data peminjaman");
        System.out.printf("""
                ID: %d
                Nama peminjam: %s
                Nama game: %s
                """, id, name, game);
    }

    public int priveToPay(int duration) {
        return this.price * duration;
    }
}
