package bridgePatten01;

public class Main {
    public static void main(String[] args) {
//        PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
//        PrintMorseCode code = new PrintMorseCode(new SoundMCF());
        PrintMorseCode code = new PrintMorseCode(new FlashMCF());

//        PrintMorseCode 에서 매소드를 void 로 했을 경우
//        code.g();code.a();code.r();code.a();code.m();

//        PrintMorseCode 에서 매소드의 리턴을 PrintMorseCode 와 this로 했을 경우
        code.g().a().r().a().m();
    }
}
