package bridgePatten01;

public class FlashMCF implements MorseCodeFunction{

    public void dot() {
        System.out.print("#");
    }
    public void dash() {
        System.out.print("-*-");
    }
    public void space() {
        System.out.print(" ");
    }
}
