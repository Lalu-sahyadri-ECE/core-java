class WeatherRunner3 {
    public static void main(String[] args) {

        Climate obj = new Climate();
        obj.id = 404;
        obj.condition = "Sunny3";
        obj.temperature = 33.5;
        obj.humidity = 68;
        obj.windSpeed = 15.3;

        Weather m = new Weather(obj);

        m.getDetails();
    }
}
