package ana.zurabashvili.weather.module;

public class Weather {
    private String cityName;
    private double temperature;
    private double humidity;
    private double pressure;
    private WindDirection windDirection;
    private double windSpeed;

    public Weather() {
    }

    public Weather(String cityName, double temperature, double humidity, double pressure, double windSpeed, WindDirection windDirection) {
//    public Weather(String cityName, double temperature, double humidity, double pressure, double windSpeed) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public String getCityName() {return cityName;}
    public double getTemperature() {return temperature;}
    public double getHumidity() {return humidity;}
    public double getPressure() {return pressure;}
    public double getWindSpeed() {
        return windSpeed;
    }

}
