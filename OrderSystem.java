class OrderSystem {
public static void sendToKitchen(String orderItem) {
System.out.println("Sending order to kitchen: " + orderItem);
Kitchen.receiveOrder(orderItem);
    }
}