class IceCream {

    Flavor flavor;

    public void setDetails(Flavor flavor) {
        this.flavor = flavor;
    }

    public void getDetails() {
        System.out.println("id: " + flavor.id);
        System.out.println("name: " + flavor.name);
        System.out.println("type: " + flavor.type);
        System.out.println("price: " + flavor.price);
        System.out.println("quantity: " + flavor.quantity);
        System.out.println("----------------------");
    }

    IceCream(Flavor flavor) { this.flavor = flavor; }

    IceCream() {}
}
