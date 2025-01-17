public class LocalPickup implements ShippingStrategy{
    @Override
    public void ship() {
        System.out.println("Shipping local pickup");
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}
