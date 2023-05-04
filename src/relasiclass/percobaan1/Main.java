package relasiclass.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor("Intel i5", 3);
        Laptop laptop1 = new Laptop("Thinkpad", processor1);
        laptop1.info();
        System.out.println();
        Processor processor2 = new Processor();
        processor2.setBrand("Intel i5");
        processor2.setCache(4);
        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Thinkpad");
        laptop2.setProcessor(processor2);
        laptop2.info();
    }
}
