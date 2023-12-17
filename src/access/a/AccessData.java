package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("call publicMethod");
    }

    void defaultMethod() {
        System.out.println("call defaultMethod");
    }

    private void privateMethod() {
        System.out.println("call privateMethod");
    }

    public void innerAccess() {
        System.out.println("call inner");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
