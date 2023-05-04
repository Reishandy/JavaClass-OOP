package inheritence.tugas.computer;
// Author: Muhammad Akbar Reishandy
public class PC extends Computer{
    private final int monitorSize;
    public PC(String brand, String processor, double processorSpeed, int memory, int monitorSize) {
        super(brand, processor, processorSpeed, memory);
        this.monitorSize = monitorSize;
    }

    public void printPC() {
        super.printComputer();
        System.out.printf("""
                Monitor     : %d
                """, monitorSize);
    }
}
