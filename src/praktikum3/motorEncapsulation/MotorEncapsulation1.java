package praktikum3.motorEncapsulation;

public class MotorEncapsulation1 {
    public static void main(String[] args) {
        Motor1 motor1 = new Motor1();

        motor1.printStatus();
        motor1.kecepatan = 50;
        motor1.printStatus();
    }
}
