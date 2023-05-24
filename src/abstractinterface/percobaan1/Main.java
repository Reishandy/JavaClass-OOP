// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Fish dolphin = new Fish();

        Person ani = new Person("Ani");
        Person budi = new Person("Budi");

        ani.pet(cat);
        budi.pet(dolphin);

        ani.walkPet();
        budi.walkPet();
    }
}
