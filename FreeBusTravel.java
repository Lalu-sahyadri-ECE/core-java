class FreeBusTravel {

    Passenger passenger;

    public void setDetails(Passenger passenger) {
        this.passenger = passenger;
    }

    public void getDetails() {
        System.out.println("id: " + passenger.id);
        System.out.println("name: " + passenger.name);
        System.out.println("age: " + passenger.age);
        System.out.println("destination: " + passenger.destination);
        System.out.println("fare: " + passenger.fare);
        System.out.println("----------------------");
    }

    FreeBusTravel(Passenger passenger) { this.passenger = passenger; }

    FreeBusTravel() {}
}
