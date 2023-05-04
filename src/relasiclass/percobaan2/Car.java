package relasiclass.percobaan2;
// Author: Muhammad Akbar Reishandy
public class Car {
    private String brand;
    private int cost;

    public Car() {}
    public int calculateCarCost(int day) {
        return cost * day;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
