package DesignPattern.ObserverPattern;

/**
 * file in DesignPattern.ObserverPattern
 * Created by suse on 15-1-18.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);


        weatherData.setMesurements(80,65,30.4f);
        weatherData.setMesurements(83,98,32.4f);
        weatherData.setMesurements(81,75,33.4f);

    }
}
