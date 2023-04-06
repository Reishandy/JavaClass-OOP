package praktikum3.motorEncapsulation;

public class MotorEncapsulation2 {
    public static void main(String[] args) {
        Motor2 motor2 = new Motor2();
        motor2.printStatus();
        motor2.tambahKecepatan();
        motor2.nyalakanMesin();
        motor2.printStatus();
        motor2.tambahKecepatan();
        motor2.printStatus();
        motor2.tambahKecepatan();
        motor2.printStatus();
        motor2.kurangiKecepatan();
        motor2.printStatus();
        motor2.matikanMesin();
        motor2.printStatus();
    }
}
