package abstractFactory01.gt;

import abstractFactory01.abst.BikeFactory;
import abstractFactory01.abst.Body;
import abstractFactory01.abst.Wheel;

public class GtBikeFactory implements BikeFactory {
    public Body createBody() {
        return new GtBody();
    }

    public Wheel createWheel() {
        return new GtWheel();
    }
}
