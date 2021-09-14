package strategy;

public class Main {

    public static void main(String[] args) {
        // [1] 인터페이스
        // 기능에 대한 선언과 구현 분리
        // 기능을 사용 통로
        Ainterface ainterface = new AinterfaceImpl();
        // 통로
        ainterface.funA();

        // [2] 델리게이트
        System.out.println("------- 델리게이트 -------");
        AObj aObj = new AObj();
        aObj.funcAA();

        // 스트레티지 패턴
        // 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
    }
}

