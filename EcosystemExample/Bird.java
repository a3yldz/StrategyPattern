public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " prrr prr.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}