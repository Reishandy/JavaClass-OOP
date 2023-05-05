package relasiclass.tugas.buyBook.book;
// Author: Muhammad Akbar Reishandy

public class Book {
    private final String title, type, author;
    private final int year, pages, price;

    public Book(String title, String type, String author, int year, int pages, int price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public void printBookData() {
        System.out.printf("""
                    --- %s
                    Price   : Rp %,d
                    Type    : %s
                    Author  : %s
                    Year    : %d
                    Pages   : %d
                """, title, price, type,
                author, year, pages);
    }

    public int getPrice() {return price;}
}
