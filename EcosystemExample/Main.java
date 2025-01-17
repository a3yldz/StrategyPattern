//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ecosystem ecosystem = new Ecosystem();

        Mammal cat = new Mammal("Cat", 5);
        Bird canary = new Bird("Canary", 3);
        Fish garfish = new Fish("Garfish", 2);

        ecosystem.addAnimal(cat);
        ecosystem.addAnimal(canary);
        ecosystem.addAnimal(garfish);

        System.out.println("Simulating a day in the ecosystem:");
        ecosystem.simulateDay();
    }
}
