class FreeBusTravelRunner2 {
    public static void main(String[] args) {

        Passenger obj = new Passenger();
        obj.id = 201;
        obj.name = "Anita";
        obj.age = 22;
        obj.destination = "Mysore";
        obj.fare = 0.0;

        FreeBusTravel m = new FreeBusTravel();
        m.setDetails(obj);

        m.getDetails();
    }
}
