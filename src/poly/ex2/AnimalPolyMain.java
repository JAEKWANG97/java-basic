package poly.ex2;

public class AnimalPolyMain {
    public static void main(String[] args) {


        Animal[] animals = {new Dog(), new Cat(), new Caw() , new Duck()};
        extracted(animals);


    }

    private static void extracted(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
