package extend1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
