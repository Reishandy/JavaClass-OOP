package kuis;
public class teoriClass {
    /*
    * Berikut adalah attribute dari kelas
    * teoriClass. ada String dan int yang
    * bersifat private
    */
    private String attributeString;
    private int attributeInt;

    public teoriClass(String attributeString, int attributeInt) {
        this.attributeString = attributeString;
        this.attributeInt = attributeInt;
    }

    /*
    * Berikut adalah behavior dari kelas
    * teoriClass. atau juga disebut
    * method dalam bahasa Java
    */
    public int getAttributeInt() {
        return attributeInt;
    }
    public void print() {
        System.out.println(attributeString);
    }
}
