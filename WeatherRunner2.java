class WeatherRunner2 {
    public static void main(String[] args) {

        Climate obj = new Climate();
        obj.id = 403;
        obj.condition = "Sunny2";
        obj.temperature = 32.5;
        obj.humidity = 67;
        obj.windSpeed = 14.3;

        Weather m = new Weather();
        m.setDetails(obj);

        m.getDetails();
    }
}
