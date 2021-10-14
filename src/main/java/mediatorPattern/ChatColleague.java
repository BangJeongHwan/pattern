package mediatorPattern;

import mediatorPattern.contract.Colleague;

public class ChatColleague extends Colleague {
    public void handle(String data) {
        System.out.println(this+"_"+data);
    }
}
