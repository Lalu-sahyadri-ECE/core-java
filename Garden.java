class Garden {

    Flower flower;

    public void setDetails(Flower flower) {
        this.flower = flower;
    }

    public void getDetails() {
        System.out.println("id: " + flower.id);
        System.out.println("name: " + flower.name);
        System.out.println("petals: " + flower.petals);
        System.out.println("color: " + flower.color);
        System.out.println("price: " + flower.price);
        System.out.println("----------------------");
    }

    Garden(Flower flower) { this.flower = flower; }

    Garden() {}
}
