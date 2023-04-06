package praktikum3.koperasi;
import java.util.Scanner;

public class MainInput {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Member member = memberInput();
        while (true) {
            printMemberData(member);
            System.out.println("""
                1. Borrow money
                2. Pay Loan
                3. Show current loan
                4. Exit""");
            System.out.println("____________________________");
            System.out.print("> ");
            int input = inputInt();
            if (input == 1) {
                try {borrowOrPay(1, member);} catch (IllegalStateException ignored) {}
            } else if (input == 2) {
                try {borrowOrPay(2, member);} catch (IllegalStateException ignored) {}
            } else if (input == 3) {
                System.out.println("____________________________");
                System.out.printf("Current loan: Rp %,.0f\n", member.getLoan());
            } else if (input == 4) {break;}
        }
    }

    private static void printMemberData(Member member) {
        System.out.println("____________________________");
        System.out.printf("""
                KTP  : %d
                Name : %s
                Limit: Rp %,d
                """, member.getKtp(), member.getName(), member.getLimit());
        System.out.println("____________________________");
    }

    private static void borrowOrPay(int mode, Member member) {
        System.out.print("Amount: ");
        int amount = inputInt();
        System.out.println("____________________________");
        if (amount <= 0) throw new IllegalStateException();
        Main.operation(mode, amount, member);
    }

    private static Member memberInput() {
        System.out.println("____________________________");
        while (true) {
            System.out.print("KTP: ");
            int ktp = inputInt();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Limit: ");
            int limit = inputInt();
            if (limit > 0 || ktp != 0) return new Member(name, ktp, limit);
        }
    }

    private static int inputInt() {
        try {return Integer.parseInt(sc.nextLine());}
        catch (NumberFormatException e) {return 0;}
    }
}
