package static2.ex;

public class Car {
    private static int totalCount;

    String name;

    public Car(String name) {
        this.name = name;
        totalCount++;
        System.out.println("buy car, name : "+ name);
    }

    public static void showTotalCars() {
        System.out.println("totalCount = " + totalCount);
    }
}
