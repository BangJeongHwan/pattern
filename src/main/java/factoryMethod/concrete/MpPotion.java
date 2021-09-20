package factoryMethod.concrete;

import factoryMethod.framework.Item;

public class MpPotion implements Item {
    public void use() {
        System.out.println("마력 회복!");
    }
}
