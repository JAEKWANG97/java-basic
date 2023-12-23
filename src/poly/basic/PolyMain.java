package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스를 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        ((Child) poly).childMethod();

    }
}
