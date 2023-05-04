package relasiclass.percobaan4;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("12345", "Mr. Krab");
        Carriage carriage = new Carriage("A", 10);
        carriage.setPassanger(passenger, 1);
        System.out.println(carriage.info());
    }
}
