package abstractFactory02.mac;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;

public class MacGuiFactory implements GuiFactory {
    public Button createButton() {
        return new MacButton();
    }

    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
