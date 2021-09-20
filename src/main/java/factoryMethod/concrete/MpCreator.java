package factoryMethod.concrete;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    protected void requestItemInfo() {
        System.out.println("데이터 베이스에서 마력 회복 물약의 정보를 가져옴");
    }

    protected void createItemLog() {
        System.out.println("마력 회복 물약을 새로 생성 했습니다. "+ new Date());
    }

    protected Item createItem() {
        return new MpPotion();
    }
}
