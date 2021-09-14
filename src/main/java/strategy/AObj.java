package strategy;

public class AObj {

    Ainterface ainterface;

    public AObj() {
        this.ainterface = new AinterfaceImpl();
    }

    public void funcAA(){

        // 위임한다
        ainterface.funA();
        ainterface.funA();

//        System.out.println("AAA");
//        System.out.println("AAA");
    }
}
