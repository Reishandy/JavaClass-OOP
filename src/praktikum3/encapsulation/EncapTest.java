package praktikum3.encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("Rei");
        encap.setAge(42);
        System.out.printf("""
                Name: %s
                Age : %d
                """, encap.getName(),
                encap.getAge());

        encap.setAge(10);
        System.out.println("Age: " + encap.getAge());
    }
}
