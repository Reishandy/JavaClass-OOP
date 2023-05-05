package relasiclass.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Processor {
    private String brand;
    private double cache;
    public Processor(){}
    public Processor(String brand, double cache) {
        this.brand = brand;
        this.cache = cache;
    }

    public void info() {
        System.out.printf("""
                Merk prosesor: %s
                Cache prosessor: %.2f
                """, this.brand, this.cache);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getCache() {
        return cache;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
}
