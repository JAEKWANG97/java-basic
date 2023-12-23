package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("init construct");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit.value = " + constructInit.value);
        System.out.println("constructInit2.value = " + constructInit2.value);

        System.out.println("Init Field");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1.value = " + fieldInit1.value);
        System.out.println("fieldInit2.value = " + fieldInit2.value);
        System.out.println("fieldInit3.value = " + fieldInit3.value);

        System.out.println("const Value");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
