package builder01;

public class Main {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
//        Computer computer = factory.makeAndGet();
        factory.make();
        Computer computer = factory.getComputer();

//        Computer computer = new Computer("i7","16G","256g ssd");
        System.out.println(computer.toString());
    }
}
