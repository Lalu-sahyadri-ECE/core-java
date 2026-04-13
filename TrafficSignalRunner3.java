class TrafficSignalRunner3 {
    public static void main(String[] args) {

        Cop obj = new Cop();
        obj.id = 104;
        obj.name = "Ravi3";
        obj.badgeNumber = 5681;
        obj.rank = "Inspector3";
        obj.salary = 45003.0;

        TrafficSignal m = new TrafficSignal(obj);

        m.getDetails();
    }
}
