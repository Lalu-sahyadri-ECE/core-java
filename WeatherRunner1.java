class WeatherRunner1 {
    public static void main(String[] args) {

        Climate obj = new Climate();
        obj.id = 402;
        obj.condition = "Sunny1";
        obj.temperature = 31.5;
        obj.humidity = 66;
        obj.windSpeed = 13.3;

        Weather m = new Weather();
        m.climate = obj;

        m.getDetails();
    }
}
