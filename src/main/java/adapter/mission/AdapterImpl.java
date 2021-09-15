package adapter.mission;

public class AdapterImpl implements Adapter{

//    Math math;

    // 알고리즘 변경을 원합니다.
    public Float twiceOf(Float f) {
        // Math 클래스에 새롭게 두 배를 구할 수 있는 함수가 추가 되었습니다.
        // 새로 구현된 알고리즘을 이용하도록 프로그램을 수정하세요
//        return (float) Math.twoTime(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue();
    }

    public Float halfOf(Float f) {
        // 절반을 구하는 기능에서 로그를 찍는 기능을 추가해주시기 바랍니다.
        System.out.println("절반 함수 호출 시작");
        return (float) Math.half(f.doubleValue());
    }
}
