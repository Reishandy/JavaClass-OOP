package relasiclass.tugas.buyBook.book;
// Author: Muhammad Akbar Reishandy

public class Dictionary extends Book{
    private final String langOrig, langDest, size;

    public Dictionary(String title, String author, int year, int pages, int price,
                      String langOrig, String langDest, String size) {
        super(title, "dictionary", author, year, pages, price);
        this.langOrig = langOrig;
        this.langDest = langDest;
        this.size = size;
    }

    public void printDictData() {
        super.printBookData();
        System.out.printf("""
                    Language: %s to %s
                    Size    : %s
                """, langOrig, langDest, size);
    }
}
