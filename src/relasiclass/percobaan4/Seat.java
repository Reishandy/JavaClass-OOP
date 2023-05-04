package relasiclass.percobaan4;
// Author: Muhammad Akbar Reishandy
public class Seat {
    private String number;
    private Passenger passenger;

    public String info() {
        return "Nomor: " + this.number + "\n" +
                ( (this.passenger != null) ?
                "Penumpang: \n" + this.passenger.info() + "\n" : "");
    }

    public Seat(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
