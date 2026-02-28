class TableManager {
 public static void seatGuest(String guestName, String orderItem) {
System.out.println("Seating guest: " + guestName);
Waiter.takeOrder(guestName, orderItem);
    }
}