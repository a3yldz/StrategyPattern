public class StandardShipping implements ShippingStrategy{
    @Override
    public void ship() {
        System.out.println("Shipping standard delivery.");
    }

    @Override
    public double getCost() {
        return 7.33;
    }
}
