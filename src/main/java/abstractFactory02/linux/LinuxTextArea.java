package abstractFactory02.linux;

import abstractFactory02.abst.TextArea;

public class LinuxTextArea implements TextArea {
    public String getText() {
        return "리눅스 텍스트 에어리어";
    }
}
