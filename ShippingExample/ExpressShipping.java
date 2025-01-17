public class ExpressShipping implements ShippingStrategy{

    public void ship(){
        System.out.println("Express Shipping Method");
    }

    public double getCost(){
        return 10.99;
    }
}
