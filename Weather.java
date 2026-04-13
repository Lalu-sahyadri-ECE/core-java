class Weather {

    Climate climate;

    public void setDetails(Climate climate) {
        this.climate = climate;
    }

    public void getDetails() {
        System.out.println("id: " + climate.id);
        System.out.println("condition: " + climate.condition);
        System.out.println("temperature: " + climate.temperature);
        System.out.println("humidity: " + climate.humidity);
        System.out.println("windSpeed: " + climate.windSpeed);
        System.out.println("----------------------");
    }

    Weather(Climate climate) { this.climate = climate; }

    Weather() {}
}
