package chainOfResposibilityPattern02;

public class Application {
    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);
        // 첫번째 공격
        armor1.defense(attack);

        System.out.println(attack.getAmount());

        /**
         * Point2
         * 동적으로도 책임을 추가할 수 있다
         */
        Defense defense = new Defense() {
            public void defense(Attack attack) {
                int amount = attack.getAmount();
                attack.setAmount(amount-=50);
            }
        };

        // 추가 착용
        armor2.setNextDefense(defense);

        attack.setAmount(100);
        // 두번째 공격
        armor1.defense(attack);
        System.out.println(attack.getAmount());
    }
}
