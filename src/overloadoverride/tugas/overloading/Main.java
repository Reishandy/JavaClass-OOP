// Author: Muhammad Akbar Reishandy
package overloadoverride.tugas.overloading;

public class Main {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.printf("""
                Segitiga Class test
                -------------------
                Sudut 10 ->
                    %d
                Sudut 10 dan 10 ->
                    %d
                Keliling 3, 4, 5 ->
                    %d
                Keliling 3, 4 ->
                    %.2f  \s
                """,
                sg.totalSudut(10),
                sg.totalSudut(10, 10),
                sg.keliling(3, 4, 5),
                sg.keliling(3, 4));
    }
}
