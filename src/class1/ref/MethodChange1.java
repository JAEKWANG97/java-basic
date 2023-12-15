package class1.ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before changePrimitive -> a = " + a);
        // a = 10
        changePrimitive(a);
        System.out.println("after changePrimitive -> a = " + a);
        // a = 10
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
