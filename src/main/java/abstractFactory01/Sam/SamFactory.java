package abstractFactory01.Sam;

import abstractFactory01.abst.BikeFactory;
import abstractFactory01.abst.Body;
import abstractFactory01.abst.Wheel;

public class SamFactory implements BikeFactory {
    public Body createBody() {
        return new SamBody();
    }

    public Wheel createWheel() {
        return new SamWheel();
    }
}
