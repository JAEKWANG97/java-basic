package static2;


import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. call static");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. call instance");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3. call instance");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

    }
}
