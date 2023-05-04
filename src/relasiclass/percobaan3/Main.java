package relasiclass.percobaan3;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        Employee masinis = new Employee("1234", "Spongebob Squarepants");
        Employee assitant = new Employee("4567", "Patrick Star");
        Train train = new Train("Gaya baru", "Bisnis", masinis, assitant);

        System.out.println(train.info());
    }
}
