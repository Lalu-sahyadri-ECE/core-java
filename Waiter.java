class Waiter {
public static void takeOrder(String guestName, String orderItem) {
System.out.println("Waiter taking order from " + guestName);
System.out.println("Order item: " + orderItem);
OrderSystem.sendToKitchen(orderItem);
    }
}