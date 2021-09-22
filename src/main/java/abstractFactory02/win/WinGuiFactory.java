package abstractFactory02.win;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;

public class WinGuiFactory implements GuiFactory {
    public Button createButton() {
        return new WinButton();
    }

    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
