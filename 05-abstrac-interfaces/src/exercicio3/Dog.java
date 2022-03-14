package exercicio3;

public class Dog extends Animal implements Carnivore {
    @Override
    public void emitSound() {
        System.out.println("AUAU!");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat...");
    }
}
