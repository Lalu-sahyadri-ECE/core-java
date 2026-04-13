class MapRunner1 {
    public static void main(String[] args) {

        Location obj = new Location();
        obj.id = 201;
        obj.name = "Whitefield";
        obj.state = "Karnataka";
        obj.pincode = 560066;
        obj.latitude = 12.9698;

        Map m = new Map();
        m.location = obj;

        m.getDetails();
    }
}
