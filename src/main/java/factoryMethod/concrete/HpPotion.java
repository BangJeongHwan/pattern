package factoryMethod.concrete;

import factoryMethod.framework.Item;

public class HpPotion implements Item {
    public void use() {
        System.out.println("체력 회복!");
    }
}
