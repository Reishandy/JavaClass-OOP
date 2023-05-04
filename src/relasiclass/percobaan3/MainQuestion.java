package relasiclass.percobaan3;
// Author: Muhammad Akbar Reishandy
public class MainQuestion {
    public static void main(String[] args) {
        Employee masinis = new Employee("1234", "Spongebob Squarepants");
        Train train = new Train("Gaya baru", "Bisnis", masinis);

        System.out.println(train.info());
    }
}
