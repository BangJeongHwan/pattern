package abstractFactory02.linux;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
