package observerPattern03;

public class Button {

    private Observable<String> observable;

    public Button() {
        this.observable = new Observable<String>();
    }

    public void addObserver(Observable.Observer<String> o) {
        observable.addObserver(o);
    }
    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
}
