package bridgePatten01;

public class PrintMorseCode extends MorseCode{

    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    // garam
    public PrintMorseCode g(){
        dash();dash();dot();space();
        return this;
    }
    public PrintMorseCode a(){
        dot();dash();space();
        return this;
    }
    public PrintMorseCode r(){
        dot();dash();dot();space();
        return this;
    }
    public PrintMorseCode m(){
        dash();dash();
        return this;
    }
}
