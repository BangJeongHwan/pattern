package abstractFactory02.mac;

import abstractFactory02.abst.Button;

public class MacButton implements Button {
    public void click() {
        System.out.println("맥 버튼");
    }
}
