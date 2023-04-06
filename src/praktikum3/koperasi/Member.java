package praktikum3.koperasi;

public class Member {
    private final String name;
    private final int ktp;
    private final int limit;
    private double loan;

    public Member(String name, int ktp, int limit) {
        this.name = name;
        this.ktp = ktp;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }
    public int getKtp() {
        return ktp;
    }
    public int getLimit() {
        return limit;
    }
    public double getLoan() {
        return loan;
    }

    public void borrow(double amount) {
        double minimal = limit * 0.1;
        if (amount > limit) {
            System.out.println("The amount of loan exceed your limit");
            return;
        }
        if (amount < minimal) {
            System.out.printf("The minimal amount of loan is Rp %,.0f (10%%)\n", minimal);
            return;
        }
        loan += amount;
    }

    public double pay(double amount) {
        if (amount <= loan) {
            loan -= amount;
            return 0;
        }
        double change = amount - loan;
        loan = 0;
        return change;
    }
}
