package inheritence.tugas.computer;
// Author: Muhammad Akbar Reishandy
public class Laptop extends Computer{
    private final int battery;
    public Laptop(String brand, String processor, double processorSpeed, int memory, int battery) {
        super(brand, processor, processorSpeed, memory);
        this.battery = battery;
    }

    public void printLaptop() {
        super.printComputer();
        System.out.printf("""
                Battery     : %d mAh
                """, battery);
    }
}
