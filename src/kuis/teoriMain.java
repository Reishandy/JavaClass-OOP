package kuis;
public class teoriMain {
    public static void main(String[] args) {
        /*
        * Berikut adalah contoh imlementasi
        * objek dari class teoriClass
        */
        teoriClass object = new teoriClass(
                "ayam", 10);
        System.out.println(object.getAttributeInt());
        object.print();
    }
}
