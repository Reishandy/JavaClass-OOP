// Author: Muhammad Akbar Reishandy
package overloadoverride.tugas.overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.print("dosen ");
        super.makan();
    }

    public void lembur() {
        System.out.println("sedang lembur");
    }
}
