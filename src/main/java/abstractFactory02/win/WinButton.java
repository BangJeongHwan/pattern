package abstractFactory02.win;

import abstractFactory02.abst.Button;

public class WinButton implements Button {
    public void click() {
        System.out.println("윈도우 버튼");
    }
}
