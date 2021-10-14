package observerPattern02;

import java.util.Observable;
import java.util.Observer;

public class Application {
    public static void main(String[] args) {
//        Observable observable;
//        Observer observer;

        Button button = new Button();
        button.addObserver(new Observer() {
            public void update(Observable o, Object arg) {
                System.out.println(o+" is Clicked");
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
