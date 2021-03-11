public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(79, 61, 35.7f);
        weatherData.setMeasurements(83, 60, 31.5f);
    }
}
