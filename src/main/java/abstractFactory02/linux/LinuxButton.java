package abstractFactory02.linux;

import abstractFactory02.abst.Button;

public class LinuxButton implements Button {
    public void click() {
        System.out.println("리눅스 버튼");
    }
}
