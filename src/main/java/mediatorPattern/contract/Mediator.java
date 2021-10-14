package mediatorPattern.contract;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    protected List<Colleague> colleagues;

    public Mediator() {
        this.colleagues = new ArrayList<Colleague>();
    }

    // 더하는 부분
    public boolean addColleague(Colleague colleague){
        if(colleagues!=null)
            return colleagues.add(colleague);
        else
            return false;
    }

    // 중재
    public abstract void mediate(String data);
}
