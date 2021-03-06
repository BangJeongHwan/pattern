package chainOfResposibilityPattern01;

public class Request {
    private int a,b;
    private String operator;

    public Request(int a, int b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperator() {
        return operator;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
