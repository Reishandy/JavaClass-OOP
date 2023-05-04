package inheritence.tugas.bangundatar;
// Author: Muhammad Akbar Reishandy
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.printf("""
                --- Persegi panjang ---
                Luas    : %.2f
                Keliling: %.2f
                """, rectangle.luas(), rectangle.keliling());

        System.out.println();
        Circle circle = new Circle(12);
        System.out.printf("""
                --- Lingkaran ---
                Luas    : %.2f
                Keliling: %.2f
                """, circle.luas(), circle.keliling());
    }
}
