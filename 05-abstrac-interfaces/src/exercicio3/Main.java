package exercicio3;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Cat();
        Animal cachorro = new Dog();
        Animal vaca = new Cow();

        animalEating(gato);
        animalEating(cachorro);
        animalEating(vaca);

    }

    public static void animalEating(Animal animal) {
        animal.emitSound();
    }
}
