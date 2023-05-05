package relasiclass.tugas.buyBook.book;
// Author: Muhammad Akbar Reishandy

public class Textbook extends Book{
    private final String grade, topic;

    public Textbook(String title, String author, int year, int pages, int price, String grade, String topic) {
        super(title, "textbook", author, year, pages, price);
        this.grade = grade;
        this.topic = topic;
    }

    public void printTextbookData() {
        super.printBookData();
        System.out.printf("""
                    Grade   : %s
                    Topic   : %s
                """, grade, topic);
    }
}
