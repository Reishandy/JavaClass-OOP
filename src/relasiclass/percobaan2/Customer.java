package relasiclass.percobaan2;
// Author: Muhammad Akbar Reishandy
public class Customer {
    private String name;
    private Car car;
    private Driver driver;
    private int day;

    public int calculateTotalCost() {
        return car.calculateCarCost(day) +
                driver.calculateDriverCost(day);
    }

    public Customer() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}
