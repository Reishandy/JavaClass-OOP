package relasiclass.tugas.buyBook;

import relasiclass.tugas.buyBook.book.*;
// Author: Muhammad Akbar Reishandy

public class Main {
    public static void main(String[] args) {
        Novel novel = new Novel("Arifureta vol.10", "Ryo Shirekome", 2018, 300, 120_000,
                "Fantsy", 8.7);
        Comic comic = new Comic("Majikoi S1", "Amamura", 2008, 144, 87_000, "Comedy",
                "Miyamura");
        Textbook textbook1 = new Textbook("Algebra for dummies", "Kuchieng", 2001, 444,
                300_000,"University", "Math");
        Textbook textbook2 = new Textbook("What is a human??? (and it's anatomy)", "Kuchieng", 2012,
                345, 260_000, "11th", "Biology");
        Dictionary dictionary = new Dictionary("Japanese x English dictionary", "Kimamoto yoshitsumo",
                2022, 1130, 520_000,"Japanese", "English", "Large");

        Person rei = new Person("Reishandy", "0896-8555-5555");
        Person ayam = new Person("Ayam Kucing", "0000-0000-0000");
        Person yuki = new Person("Yukimura Sanada", "0987-6543-2100");

        Coupon couponCash = new Coupon("ABBY001", 100_000);
        Coupon couponPercent = new Coupon("KUY20", 0.2);

        Order order1 = new Order("AC-01", rei, couponPercent);
        order1.addNovel(novel);

        Order order2 = new Order("AC-02", ayam, couponCash);
        order2.addTextbook(textbook1);
        order2.addTextbook(textbook2);

        Order order3 = new Order("AC-03", yuki);
        order3.addComic(comic);
        order3.addDictionary(dictionary);

        order1.printOrder();
        System.out.println();
        order2.printOrder();
        System.out.println();
        order3.printOrder();
        System.out.println();
    }
}
