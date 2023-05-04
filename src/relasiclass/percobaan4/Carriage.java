package relasiclass.percobaan4;
// Author: Muhammad Akbar Reishandy
public class Carriage {
    private String code;
    private Seat[] seats;

    public Carriage(String code, int capacity) {
        this.code = code;
        this.seats = new Seat[capacity];
        this.initSeat();
    }

    private void initSeat() {
        for (int i = 0; i < seats.length; i++) {
            this.seats[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + code + "\n";
        for (Seat seat: seats) {
            info += seat.info();
        }
        return info;
    }

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}
    public void setPassanger(Passenger passenger, int number) {
        this.seats[number - 1].setPassenger(passenger);
    }
}
