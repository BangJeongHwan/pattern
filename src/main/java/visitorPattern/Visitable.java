package visitorPattern;

public interface Visitable {
    // 방문을 허락하는 일을 담당
    public void accept(Visitor visitor);
}
