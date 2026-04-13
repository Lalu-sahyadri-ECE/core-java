class TrafficSignal {

    Cop cop;

    public void setDetails(Cop cop) {
        this.cop = cop;
    }

    public void getDetails() {
        System.out.println("id: " + cop.id);
        System.out.println("name: " + cop.name);
        System.out.println("badgeNumber: " + cop.badgeNumber);
        System.out.println("rank: " + cop.rank);
        System.out.println("salary: " + cop.salary);
        System.out.println("----------------------");
    }

    TrafficSignal(Cop cop) { this.cop = cop; }

    TrafficSignal() {}
}
