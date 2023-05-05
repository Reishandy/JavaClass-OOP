package relasiclass.percobaan3;
// Author: Muhammad Akbar Reishandy
public class Train {
    private String name;
    private String _class;
    private Employee masinis;
    private Employee assistant;

    public String info() {
        return "Nama: " + this.name + "\n" +
                "Kelas: " + this._class + "\n" +
                "Masinis: \n" + this.masinis.info() +
                "Asisten: \n" + ( (this.assistant != null) ? this.assistant.info() : "" ) + "\n";
    }

    public Train(String name, String _class, Employee masinis) {
        this.name = name;
        this._class = _class;
        this.masinis = masinis;
    }
    public Train(String name, String _class, Employee masinis, Employee assistant) {
        this.name = name;
        this._class = _class;
        this.masinis = masinis;
        this.assistant = assistant;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String get_class() {
        return _class;
    }
    public void set_class(String _class) {
        this._class = _class;
    }
    public Employee getMasinis() {
        return masinis;
    }
    public void setMasinis(Employee masinis) {
        this.masinis = masinis;
    }
    public Employee getAssistant() {
        return assistant;
    }
    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
}
