package relasiclass.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Laptop {
    private  String brand;
    private Processor processor;

    public Laptop(){}
    public Laptop(String brand, Processor processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public void info() {
        System.out.printf("Merk laptop: %s\n", this.brand);
        processor.info();
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Processor getProcessor() {
        return processor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
