import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter order ID:");
        String orderId = scanner.nextLine();
        Order order = new Order(orderId);

        boolean cont = true;

        while (cont) {

            System.out.println();
            System.out.println("Choose shipping method:");
            System.out.println("1. Standard Shipping");
            System.out.println("2. Express Shipping");
            System.out.println("3. Local Pickup");
            System.out.print("Enter choice (1-3): ");
            int shippingChoice = scanner.nextInt();

            switch (shippingChoice) {
                case 1:
                    order.setShippingStrategy(new StandardShipping());
                    break;
                case 2:
                    order.setShippingStrategy(new ExpressShipping());
                    break;
                case 3:
                    order.setShippingStrategy(new LocalPickup());
                    break;
                default: {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }
            System.out.println();
            System.out.println("Choose packaging method:");
            System.out.println("1. Minimal Packaging");
            System.out.println("2. Gift Wrapping");
            System.out.println("3. Bulk Packaging");
            System.out.print("Enter choice (1-3): ");
            int packagingChoice = scanner.nextInt();

            switch (packagingChoice) {
                case 1:
                    order.setPackagingStrategy(new MinimalPackaging());
                    break;
                case 2:
                    order.setPackagingStrategy(new GiftWrapping());
                    break;
                case 3:
                    order.setPackagingStrategy(new BulkPackaging());
                    break;
                default: {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }

            System.out.println();
            System.out.println("Processing order...");
            order.fulfillOrder();
            System.out.println();
            System.out.print("Change shipping method? (y/n): ");
            cont = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("Order complete!");
        scanner.close();
    }
}
