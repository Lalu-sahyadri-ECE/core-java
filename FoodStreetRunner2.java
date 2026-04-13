class FoodStreetRunner2 {
    public static void main(String[] args) {

        Stall obj = new Stall();
        obj.id = 501;
        obj.name = "Shivaji Chats";
        obj.cuisine = "Indian";
        obj.stallNumber = 12;
        obj.rating = 4.5;

        FoodStreet m = new FoodStreet();
        m.setDetails(obj);

        m.getDetails();
    }
}
