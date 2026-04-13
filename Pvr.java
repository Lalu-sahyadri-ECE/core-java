class Pvr {

    Screen screen;

    public void setDetails(Screen screen) {
        this.screen = screen;
    }

    public void getDetails() {
        System.out.println("id: " + screen.id);
        System.out.println("screenType: " + screen.screenType);
        System.out.println("seats: " + screen.seats);
        System.out.println("quality: " + screen.quality);
        System.out.println("size: " + screen.size);
        System.out.println("----------------------");
    }

    Pvr(Screen screen) { this.screen = screen; }

    Pvr() {}
}
