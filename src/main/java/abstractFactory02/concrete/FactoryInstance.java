package abstractFactory02.concrete;

import abstractFactory02.abst.GuiFactory;
import abstractFactory02.linux.LinuxGuiFactory;
import abstractFactory02.mac.MacGuiFactory;
import abstractFactory02.win.WinGuiFactory;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {
        switch (getOsCode()){
            case 0: return new MacGuiFactory();
            case 1: return new LinuxGuiFactory();
            case 2: return new WinGuiFactory();
        }
        return null;
    }

    private static int getOsCode() {
        if(System.getProperty("os.name").indexOf("Windows")>-1){
            return 2;
        }else{
            return 0;
        }
    }
}
