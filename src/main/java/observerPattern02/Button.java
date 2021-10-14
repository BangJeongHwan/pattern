package observerPattern02;

import java.util.Observable;

public class Button extends Observable {
    public void onClick(){
        // changed를 true로 변경해주어야 동작한다
        setChanged();
        notifyObservers();
    }
}
