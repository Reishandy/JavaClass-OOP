// Author: Muhammad Akbar Reishandy
package overloadoverride.percobaan1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test for Manager and Staff Class\n");
        Manager[] managers = new Manager[2];
        Staff[] staffs1 = new Staff[2];
        Staff[] staffs2 = new Staff[3];

        // Manager initialization
        managers[0] = new Manager();
        managers[0].setNama("Tedjo");
        managers[0].setNip("101");
        managers[0].setGolongan("1");
        managers[0].setTunjangan(5_000_000);
        managers[0].setBagian("Administrasi");

        managers[1] = new Manager();
        managers[1].setNama("Atika");
        managers[1].setNip("102");
        managers[1].setGolongan("1");
        managers[1].setTunjangan(2_500_000);
        managers[1].setBagian("Pemasaran");

        // Staff initialization
        staffs1[0] = new Staff();
        staffs1[0].setNama("Usman");
        staffs1[0].setNip("0003");
        staffs1[0].setGolongan("2");
        staffs1[0].setLembur(10);
        staffs1[0].setGajiLembur(10_000);

        staffs1[1] = new Staff();
        staffs1[1].setNama("Anugrah");
        staffs1[1].setNip("0005");
        staffs1[1].setGolongan("2");
        staffs1[1].setLembur(10);
        staffs1[1].setGajiLembur(55_000);

        managers[0].setStaff(staffs1);

        staffs2[0] = new Staff();
        staffs2[0].setNama("Handra");
        staffs2[0].setNip("0004");
        staffs2[0].setGolongan("3");
        staffs2[0].setLembur(15);
        staffs2[0].setGajiLembur(5_500);

        staffs2[1] = new Staff();
        staffs2[1].setNama("Arie");
        staffs2[1].setNip("0006");
        staffs2[1].setGolongan("4");
        staffs2[1].setLembur(5);
        staffs2[1].setGajiLembur(100_000);

        staffs2[2] = new Staff();
        staffs2[2].setNama("Mentari");
        staffs2[2].setNip("0007");
        staffs2[2].setGolongan("3");
        staffs2[2].setLembur(6);
        staffs2[2].setGajiLembur(20_000);

        managers[1].setStaff(staffs2);

        // Print information
        managers[0].lihatInfo();
        System.out.println();
        managers[1].lihatInfo();
    }
}
