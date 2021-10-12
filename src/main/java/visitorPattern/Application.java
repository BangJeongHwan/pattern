package visitorPattern;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<Visitable> visitables = new ArrayList<Visitable>();
        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();
        // (1) 이런방법도 가능 그러나, 역할에 대한 분리가 용이하기 때문에 방문자 패턴을 사용한다
//        int ageSum = 0;
        for(Visitable visitable : visitables){
            visitable.accept(visitor);
            // (1) 이런방법도 가능 그러나, 역할에 대한 분리가 용이하기 때문에 방문자 패턴을 사용한다
//            ageSum += ((VisitableA)visitable).getAge();
        }
        System.out.println(((VisitorA) visitor).getAgeSum());
        // (1) 이런방법도 가능 그러나, 역할에 대한 분리가 용이하기 때문에 방문자 패턴을 사용한다
//        System.out.println(ageSum);
    }
}
