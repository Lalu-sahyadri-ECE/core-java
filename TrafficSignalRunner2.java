class TrafficSignalRunner2 {
    public static void main(String[] args) {

        Cop obj = new Cop();
        obj.id = 103;
        obj.name = "Ravi2";
        obj.badgeNumber = 5680;
        obj.rank = "Inspector2";
        obj.salary = 45002.0;

        TrafficSignal m = new TrafficSignal();
        m.setDetails(obj);

        m.getDetails();
    }
}
