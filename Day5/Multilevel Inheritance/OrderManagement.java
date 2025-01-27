class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + this.orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order tracking number " + this.trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

   
    public String getOrderStatus() {
        return "Order delivered on " + this.deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ab12", "10-01-25");
        ShippedOrder shippedOrder = new ShippedOrder("ab12", "10-01-2025", "TN112233");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ab12", "10-01-2025", "TN112233", "18-01-2025");

        System.out.println(order.getOrderStatus());
        System.out.println();

        System.out.println(shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println(deliveredOrder.getOrderStatus());
    }
}