package inheritence.tugas.bangundatar;
// Author: Muhammad Akbar Reishandy
public class Rectangle extends BangunDatar{
    private final float length, width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float luas() {
        return length * width;
    }

    @Override
    public float keliling() {
        return 2 * (length + width);
    }
}
