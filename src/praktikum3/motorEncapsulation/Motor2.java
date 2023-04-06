package praktikum3.motorEncapsulation;

public class Motor2 {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn) kecepatan += 5;
        else System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
    }

    public void kurangiKecepatan() {
        if (kontakOn) kecepatan -= 5;
        else System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
    }

    public void printStatus() {
        if (kontakOn) System.out.println("Kontak On");
        else System.out.println("Kontak Off");

        System.out.printf("Kecepatan: %d \n\n", kecepatan);
    }
}
