class IceCreamRunner3 {
    public static void main(String[] args) {

        Flavor obj = new Flavor();
        obj.id = 501;
        obj.name = "Chocolate";
        obj.type = "Cone";
        obj.price = 50.0;
        obj.quantity = 2;

        IceCream m = new IceCream(obj);

        m.getDetails();
    }
}
