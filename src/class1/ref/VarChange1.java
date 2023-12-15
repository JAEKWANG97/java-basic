package class1.ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 20;
        int b = a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        
        b = 30;

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        a = 40;

        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
