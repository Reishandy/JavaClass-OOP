package relasiclass.tugas.buyBook.book;
// Author: Muhammad Akbar Reishandy

public class Comic extends Book{
    private final String genre, artist;

    public Comic(String title, String author, int year, int pages, int price, String genre, String artist) {
        super(title, "comic", author, year, pages, price);
        this.genre = genre;
        this.artist = artist;
    }

    public void printComicData() {
        super.printBookData();
        System.out.printf("""
                    Genre   : %s
                    Artist  : %s
                """, genre, artist);
    }
}
