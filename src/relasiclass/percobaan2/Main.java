package relasiclass.percobaan2;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Avanza");
        car.setCost(350_000);
        Driver driver = new Driver();
        driver.setName("John Doe");
        driver.setCost(200_000);
        Customer customer = new Customer();
        customer.setName("Reishandy");
        customer.setCar(car);
        customer.setDriver(driver);
        customer.setDay(2);
        System.out.printf("""
                Mobil : %s @ Rp %,d/hr
                Sopir : %s @ Rp %,d/hr
                Peminjaman : %s Hari
                Biaya total = Rp %,d
                """, car.getBrand(), car.getCost(),
                driver.getName(), driver.getCost(),
                customer.getDay(),
                customer.calculateTotalCost());
    }
}
