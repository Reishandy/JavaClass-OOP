// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan1;

public class Person {
    private final String name;
    private Animal pet;

    public Person(String name) {
        this.name = name;
    }

    public void pet(Animal pet) {
        this.pet = pet;
    }

    public void walkPet() {
        System.out.println("Namaku " + name);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        pet.move();
        System.out.println("------------------------------------------");
    }
}
