package inheritence.percobaan1;
// Author: Muhammad Akbar Reishandy
public class Employee {
    public String name, address, gender;
    public int age, salary;
    public Employee() {
    }
    public Employee(String name, String address, String gender, int age, int salary) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public void showEmployeeData() {
        System.out.printf("""
                Nama            : %s
                Alamat          : %s
                Jenis kelamin   : %s
                Umur            : %d
                Gaji            : Rp %,d
                """, name, address, gender, age, salary);
    }
}
