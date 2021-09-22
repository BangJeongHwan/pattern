package abstractFactory01;

import abstractFactory01.Sam.SamFactory;
import abstractFactory01.abst.BikeFactory;
import abstractFactory01.abst.Body;
import abstractFactory01.abst.Wheel;
import abstractFactory01.gt.GtBikeFactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

        BikeFactory factory1 = new GtBikeFactory();
        Body body1 = factory1.createBody();
        Wheel wheel1 = factory1.createWheel();

        System.out.println(body1.getClass());
        System.out.println(wheel1.getClass());

    }

}
