package poly.ex5;

public class InterfaceAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal interfaceAnimal){
        System.out.println("동물 소리 시작");
        interfaceAnimal.sound();
        System.out.println("동물 소리 종료");
    }
}
