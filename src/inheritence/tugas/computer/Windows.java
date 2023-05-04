package inheritence.tugas.computer;
// Author: Muhammad Akbar Reishandy
public class Windows extends Laptop{
    private String features;
    public Windows(String brand, String processor, double processorSpeed, int memory, int battery, String features) {
        super(brand, processor, processorSpeed, memory, battery);
        this.features = features;
    }

    public void printWindows() {
        super.printLaptop();
        System.out.printf("""
                Features    : %s
                """, features);
    }
}
