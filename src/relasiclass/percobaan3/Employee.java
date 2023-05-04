package relasiclass.percobaan3;
// Author: Muhammad Akbar Reishandy
public class Employee {
    private String nip;
    private String name;

    public String info() {
        return "NIP: " + this.nip + "\n" +
                "Name: " + this.name + "\n";
    }

    public Employee(String nip, String name) {
        this.nip = nip;
        this.name = name;
    }
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
