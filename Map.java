class Map {

    Location location;

    public void setDetails(Location location) {
        this.location = location;
    }

    public void getDetails() {
        System.out.println("id: " + location.id);
        System.out.println("name: " + location.name);
        System.out.println("state: " + location.state);
        System.out.println("pincode: " + location.pincode);
        System.out.println("latitude: " + location.latitude);
        System.out.println("----------------------");
    }

    Map(Location location) { this.location = location; }

    Map() {}
}
