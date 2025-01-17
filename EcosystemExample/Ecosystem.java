import java.util.ArrayList;
import java.util.List;

public class Ecosystem {
    private List<Animal> animals;

    public Ecosystem() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulateDay() {
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.makeSound();

            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            }
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
}