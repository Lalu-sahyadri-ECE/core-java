class Kitchen {
public static void receiveOrder(String orderItem) {
System.out.println("Kitchen received order: " + orderItem);
HeadChef.cook(orderItem);
    }
}