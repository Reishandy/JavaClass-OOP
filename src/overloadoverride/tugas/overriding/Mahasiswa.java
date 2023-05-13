// Author: Muhammad Akbar Reishandy
package overloadoverride.tugas.overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.print("mahasiswa ");
        super.makan();
    }

    public void tidur() {
        System.out.println("sedang tidur");
    }
}
