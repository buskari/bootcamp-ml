package exercicio3;

public class Cat extends Animal implements Carnivore {
    @Override
    public void emitSound() {
        System.out.println("MIAU!");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat...");
    }
}
