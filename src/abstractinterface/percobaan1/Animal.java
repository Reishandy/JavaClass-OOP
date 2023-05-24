// Author: Muhammad Akbar Reishandy
package abstractinterface.percobaan1;

public abstract class Animal {
    private int age;

    protected Animal() {
        this.age = 0;
    }

    public void getOlder() {
        this.age += 1;
    }

    public abstract void move();
}
