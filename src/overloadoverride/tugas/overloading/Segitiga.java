// Author: Muhammad Akbar Reishandy
package overloadoverride.tugas.overloading;

public class Segitiga {
    // Menurut saya ini tidak dibutuhkan jadi langsung return
    // private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // kalau sesuai modul
        // return Math.sqrt(sisiA^2) + Math.sqrt(sisiB^2);
        return sisiA + sisiB +
                Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}
