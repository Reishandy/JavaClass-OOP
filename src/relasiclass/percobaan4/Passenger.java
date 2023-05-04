package relasiclass.percobaan4;
// Author: Muhammad Akbar Reishandy
public class Passenger {
    private String ktp;
    private String name;

    public String info() {
        return "\tKTP: " + this.ktp + "\n" +
                "\tNama: " + this.name;
    }

    public Passenger(String ktp, String name) {
        this.ktp = ktp;
        this.name = name;
    }
    public String getKtp() {
        return ktp;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
