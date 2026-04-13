class FoodStreet {

    Stall stall;

    public void setDetails(Stall stall) {
        this.stall = stall;
    }

    public void getDetails() {
        System.out.println("id: " + stall.id);
        System.out.println("name: " + stall.name);
        System.out.println("cuisine: " + stall.cuisine);
        System.out.println("stallNumber: " + stall.stallNumber);
        System.out.println("rating: " + stall.rating);
        System.out.println("----------------------");
    }

    FoodStreet(Stall stall) { this.stall = stall; }

    FoodStreet() {}
}
