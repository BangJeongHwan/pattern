package abstractFactory02;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;
import abstractFactory02.concrete.FactoryInstance;
import abstractFactory02.linux.LinuxGuiFactory;
import abstractFactory02.mac.MacGuiFactory;
import abstractFactory02.win.WinGuiFactory;

public class Main {
    public static void main(String[] args) {
//        GuiFactory factory = new LinuxGuiFactory();
//        GuiFactory factory = new MacGuiFactory();
//        GuiFactory factory = new WinGuiFactory();
        GuiFactory factory = FactoryInstance.getGuiFactory();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
