package inheritence.tugas.bangundatar;
// Author: Muhammad Akbar Reishandy
public class Circle extends BangunDatar{
    private final float r;
    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
