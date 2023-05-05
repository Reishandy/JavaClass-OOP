package relasiclass.tugas.buyBook;
// Author: Muhammad Akbar Reishandy

public class Coupon {
    private final String code;
    private final int discountCash;
    private final double discountPercent;

    public Coupon(String code, int discountCash) {
        this.code = code;
        this.discountCash = discountCash;
        this.discountPercent = 0;
    }

    public Coupon(String code, double discountPercent) {
        this.code = code;
        this.discountCash = 0;
        this.discountPercent = discountPercent;
    }

    public String getCode() {return code;}
    public int getDiscountCash() {return discountCash;}
    public double getDiscountPercent() {return discountPercent;}
}
