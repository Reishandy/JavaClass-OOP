package inheritence.tugas.computer;
// Author: Muhammad Akbar Reishandy
public class Mac extends Laptop{
    private final String security;
    public Mac(String brand, String processor, double processorSpeed, int memory, int battery, String security) {
        super(brand, processor, processorSpeed, memory, battery);
        this.security = security;
    }

    public void printMac() {
        super.printLaptop();
        System.out.printf("""
                Security    : %s
                """, security);
    }
}
