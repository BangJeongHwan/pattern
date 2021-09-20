package templateMethod;

import prod.templateMethod.AbstGameConnectHelper;
import prod.templateMethod.DefaultGameConnectionHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectionHelper();

        // 아래 함수들이 호출되지 않기 위해서는 main클래스와 선언부를 나누어야한다.
//        helper.connection();
//        helper.authentication();
//        helper.authorization();
//        helper.doSecurity();

        helper.requestConnection("아이디 암호 등 접속 정보");


    }
}
