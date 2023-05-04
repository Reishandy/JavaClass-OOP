package inheritence.tugas.computer;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Asus", "Intel Core i5-13600", 5.00, 16, 1440);
        System.out.println("--- PC ---");
        pc.printPC();
        System.out.println();

        Mac mac = new Mac("Apple", "M2", 3.49, 8, 7_336,
                "Security???");
        System.out.println("--- Mac ---");
        mac.printMac();
        System.out.println();

        Windows windows = new Windows("Lenovo", "Intel Core i3-1315U", 4.50, 8,
                8_000, "Some features...");
        System.out.println("--- Windows ---");
        windows.printWindows();
        System.out.println();
    }
}
