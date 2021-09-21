package deepShallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // 낮은 수준의 복사
        Cat navi = new Cat();
        navi.setName("navi");
        
        Cat yo = navi;
        yo.setName("yo");

        System.out.println("navi.getName() = " + navi.getName());
        System.out.println("yo.getName() = " + yo.getName());

        // 깊은 복사
        Cat navi1 = new Cat();
        navi1.setName("navi");
        navi1.setAge(new Age(2012,3));

        Cat yo1 = navi1.copy();
        yo1.setName("yo");
//        yo1.setAge(new Age(2013,2));
        yo1.getAge().setYear(2013);
        yo1.getAge().setValue(2);

        System.out.println("navi1.getName() = " + navi1.getName());
        System.out.println("yo1.getName() = " + yo1.getName());

        System.out.println("navi1.getAge() = " + navi1.getAge().getYear());
        System.out.println("navi1.getValue() = " + navi1.getAge().getValue());
        System.out.println("yo1.getAge() = " + yo1.getAge().getYear());
        System.out.println("yo1.getValue() = " + yo1.getAge().getValue());
//        navi1.getAge() = 2013
//        navi1.getValue() = 2
//        yo1.getAge() = 2013
//        yo1.getValue() = 2

        // Cat에 추가
        // ret.setAge(new Age(this.age.getYear(),this.age.getValue()));
//        navi1.getAge() = 2012
//        navi1.getValue() = 3
//        yo1.getAge() = 2013
//        yo1.getValue() = 2
    }
}
