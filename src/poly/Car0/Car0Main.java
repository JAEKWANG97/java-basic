package poly.Car0;

public class Car0Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);

        driver.dirve();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.dirve();
    }
}
