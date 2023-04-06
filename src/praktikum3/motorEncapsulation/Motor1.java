package praktikum3.motorEncapsulation;

public class Motor1 {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn) System.out.println("Kontak On");
        else System.out.println("Kontak Off");

        System.out.printf("Kecepatan: %d \n\n", kecepatan);
    }
}
