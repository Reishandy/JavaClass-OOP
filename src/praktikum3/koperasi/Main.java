package praktikum3.koperasi;

public class Main {
    public static void main(String[] args) {
        Member donny = new Member("Donny", 111333444, 5_000_000);
        System.out.printf("""
                KTP  : %d
                Name : %s
                Limit: Rp %,d
                """, donny.getKtp(), donny.getName(), donny.getLimit());
        System.out.println("____________________________");

        operation(1, 10_000_000, donny);
        operation(1, 200_000, donny);
        operation(1, 4_000_000, donny);
        operation(2, 1_000_000, donny);
        operation(2, 3_500_000, donny);
    }

    static void operation(int mode, double amount, Member member) {
        double change = 0;
        switch (mode) {
            case 1 -> {
                System.out.printf("\nBorrowing Rp %,.0f...\n", amount);
                member.borrow(amount);
            }
            case 2 -> {
                System.out.printf("\nPaying Rp %,.0f...\n", amount);
                change = member.pay(amount);
            }
        }

        System.out.printf("Current loan: Rp %,.0f\n", member.getLoan());
        if (change > 0) System.out.printf("Change: Rp %,.0f\n", change);
        System.out.println("____________________________");
    }
}
