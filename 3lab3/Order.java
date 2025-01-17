public class Order {
    private String orderId;
    private ShippingStrategy shippingStrategy;
    private PackagingStrategy packagingStrategy;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setPackagingStrategy(PackagingStrategy packagingStrategy) {
        this.packagingStrategy = packagingStrategy;
    }

    public void fulfillOrder() {
        System.out.println("Fulfilling order: " + orderId);
        packagingStrategy.pack();
        shippingStrategy.ship();
        double totalCost = packagingStrategy.getCost() + shippingStrategy.getCost();
        System.out.println("Total fulfillment cost: $" + totalCost);
    }
}
