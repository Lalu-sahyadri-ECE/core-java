class MortuaryRunner1 {
    public static void main(String[] args) {

        Body obj = new Body();
        obj.id = 301;
        obj.name = "Unknown";
        obj.cause = "Accident";
        obj.age = 45;
        obj.weight = 70.5;

        Mortuary m = new Mortuary();
        m.body = obj;

        m.getDetails();
    }
}
