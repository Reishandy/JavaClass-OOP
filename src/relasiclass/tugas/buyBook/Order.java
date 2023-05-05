package relasiclass.tugas.buyBook;

import relasiclass.tugas.buyBook.book.*;
import java.util.ArrayList;
// Author: Muhammad Akbar Reishandy

public class Order extends Textbook {
    private final String id;
    private int totalPrice;
    private final Person person;
    private Coupon coupon;
    private final ArrayList<Novel> novels = new ArrayList<>();
    private final ArrayList<Comic> comics = new ArrayList<>();
    private final ArrayList<Textbook> textbooks = new ArrayList<>();
    private final ArrayList<Dictionary> dictionaries = new ArrayList<>();

    public Order(String id, Person person) {
        this.id = id;
        this.person = person;
    }

    public Order(String id, Person person, Coupon coupon) {
        this.id = id;
        this.person = person;
        this.coupon = coupon;
    }

    public void addNovel(Novel novel) {novels.add(novel);}
    public void addComic(Comic comic) {comics.add(comic);}
    public void addTextbook(Textbook textbook) {textbooks.add(textbook);}
    public void addDictionary(Dictionary dictionary) {dictionaries.add(dictionary);}

    public void printOrder() {
        calculateTotalPrice();
        System.out.printf("""
                === Order %s ===
                For %s @ %s
                --- Book/s ---
                """, id, person.getName(), person.getPhone());

        for (Novel novel: novels) novel.printNovelData();
        for (Comic comic: comics) comic.printComicData();
        for (Textbook textbook: textbooks) textbook.printTextbookData();
        for (Dictionary dictionary: dictionaries) dictionary.printDictData();

        System.out.println("--- Coupon ---");
        if (coupon != null) {
            System.out.println("Code    : " + coupon.getCode());
            if (coupon.getDiscountCash() != 0) {
                System.out.printf("Discount: Rp %,d\n", coupon.getDiscountCash());
            }
            if (coupon.getDiscountPercent() != 0) {
                System.out.println("Discount: " + coupon.getDiscountPercent() * 100 + "%");
            }
        } else {
            System.out.println("-None");
        }

        System.out.printf("""
                --- Price to pay ---
                Rp. %,d
                """, totalPrice);
    }

    private void calculateTotalPrice() {
        for (Novel novel: novels) totalPrice += novel.getPrice();
        for (Comic comic: comics) totalPrice += comic.getPrice();
        for (Textbook textbook: textbooks) totalPrice += textbook.getPrice();
        for (Dictionary dictionary: dictionaries) totalPrice += dictionary.getPrice();

        if (coupon == null) return;
        if (coupon.getDiscountCash() != 0) {
            totalPrice -= coupon.getDiscountCash();}
        if (coupon.getDiscountPercent() != 0) {
            totalPrice -= (totalPrice * coupon.getDiscountPercent());}
    }
}
