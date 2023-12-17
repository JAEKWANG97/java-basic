package static2.ex;

import static static2.ex.MathUtils.*;

public class MathUtilsMain {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("MathUtils.sum(values) = " + sum(values));
        System.out.println("MathUtils.average(values) = " + average(values));
        System.out.println("MathUtils.min(values) = " + min(values));
        System.out.println("MathUtils.max(values) = " + max(values));
    }
}
