class TrafficSignalRunner1 {
    public static void main(String[] args) {

        Cop obj = new Cop();
        obj.id = 102;
        obj.name = "Ravi1";
        obj.badgeNumber = 5679;
        obj.rank = "Inspector1";
        obj.salary = 45001.0;

        TrafficSignal m = new TrafficSignal();
        m.cop = obj;

        m.getDetails();
    }
}
