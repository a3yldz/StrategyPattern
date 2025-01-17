public class MinimalPackaging implements PackagingStrategy {
    @Override
    public void pack() {
        System.out.println("Packing with minimal materials.");
    }

    @Override
    public double getCost() {
        return 2.30;
    }
}
