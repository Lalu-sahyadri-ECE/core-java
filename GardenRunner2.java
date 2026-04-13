class GardenRunner2 {
    public static void main(String[] args) {

        Flower obj = new Flower();
        obj.id = 301;
        obj.name = "Rose";
        obj.petals = 20;
        obj.color = "Red";
        obj.price = 15.0;

        Garden m = new Garden();
        m.setDetails(obj);

        m.getDetails();
    }
}
