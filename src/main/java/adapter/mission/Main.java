package adapter.mission;


public class Main {
    // 두 수에 대한 다음 연산을 수행하는 객체를 만들어주세요
        // 수의 두배의 수를 반환 : twiceOf(Float) : Float
        // 수의 반(1/2)의 수를 반환 : halfOf(Float) : Float
    // 구현 객체 이름은 'Adapter'으로 해주세요
    // Math 클래스에서 두 배와 절반을 구하는 함수는 이미 구현되어있습니다.

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
    }
}
