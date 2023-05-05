package relasiclass.tugas.buyBook.book;
// Author: Muhammad Akbar Reishandy

public class Novel extends Book{
    private final String genre;
    private final double rating;

    public Novel(String title, String author, int year, int pages, int price, String genre, double rating) {
        super(title, "novel", author, year, pages, price);
        this.genre = genre;
        this.rating = rating;
    }

    public void printNovelData() {
        super.printBookData();
        System.out.printf("""
                    Genre   : %s
                    Rating  : %.1f
                """, genre, rating);
    }
}
