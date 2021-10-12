package bridgePatten01;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot();
//        System.out.print(".");
    }
    public void dash() {
        function.dash();
//        System.out.print("-");
    }
    public void space() {
        function.space();
//        System.out.print(" ");
    }
}
