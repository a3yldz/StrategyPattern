public class GiftWrapping implements PackagingStrategy {
    @Override
    public void pack() {
        System.out.println("Packing gift wrapping.");
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
