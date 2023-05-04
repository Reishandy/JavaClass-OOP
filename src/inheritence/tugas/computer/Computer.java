package inheritence.tugas.computer;
// Author: Muhammad Akbar Reishandy
public class Computer {
    private final String brand, processor;
    private final int memory;
    private final double processorSpeed;
    public Computer(String brand, String processor, double processorSpeed, int memory) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.processorSpeed = processorSpeed;
    }

    public void printComputer() {
        // Kecepatan dan prosesor langsung jadi satu baris (prosesor @ kecpatan)
        System.out.printf("""
                Brand       : %s
                Processor   : %s @ %.2f GHz
                Memory(ram) : %d GB
                """, brand, processor, processorSpeed, memory);
    }
}
