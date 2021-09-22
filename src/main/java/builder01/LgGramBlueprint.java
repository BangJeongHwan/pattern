package builder01;

public class LgGramBlueprint extends BluePrint{

    private Computer computer;

    public LgGramBlueprint() {
        this.computer = new Computer("default","default","default");
    }

    public void setCpu() {
        computer.setCpu("i7");
    }

    public void setRam() {
        computer.setRam("8g");
    }

    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    public Computer getComputer() {
        return computer;
    }
}
