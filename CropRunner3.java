class CropRunner3 {
    public static void main(String[] args) {

        Farmer obj = new Farmer();
        obj.id = 101;
        obj.name = "Ramesh";
        obj.landArea = 5;
        obj.cropType = "Sugarcane";
        obj.income = 200000.0;

        Crop m = new Crop(obj);

        m.getDetails();
    }
}
