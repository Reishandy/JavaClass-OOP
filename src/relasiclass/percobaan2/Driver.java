package relasiclass.percobaan2;
// Author: Muhammad Akbar Reishandy
public class Driver {
    private String name;
    private int cost;

    public Driver() {
    }
    public int calculateDriverCost(int day) {
        return cost * day;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
