package exercicio3;

public class Cow extends Animal implements Herbivore {
    @Override
    public void emitSound() {
        System.out.println("MUUUUU!");
    }

    @Override
    public void eatPlant() {
        System.out.println("Eating plant...");
    }
}
