package mediatorPattern;

import mediatorPattern.contract.Colleague;
import mediatorPattern.contract.Mediator;

public class ChatMediator extends Mediator {
    public void mediate(String data) {
        for (Colleague colleague : colleagues){
            // 중재 가능성
            colleague.handle(data);
        }
    }
}
