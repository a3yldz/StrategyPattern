public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " blup blup.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
