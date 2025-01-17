public class BulkPackaging implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("Bulk Packaging");
    }

    @Override
    public double getCost() {
        return 4;
    }
}
