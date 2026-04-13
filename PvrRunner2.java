class PvrRunner2 {
    public static void main(String[] args) {

        Screen obj = new Screen();
        obj.id = 401;
        obj.screenType = "IMAX";
        obj.seats = 200;
        obj.quality = "4K";
        obj.size = 70.5;

        Pvr m = new Pvr();
        m.setDetails(obj);

        m.getDetails();
    }
}
