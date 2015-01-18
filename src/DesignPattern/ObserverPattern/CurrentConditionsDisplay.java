package DesignPattern.ObserverPattern;

/**
 * file in DesignPattern.ObserverPattern
 * Created by suse on 15-1-18.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private  float temperature;
    private float humidity;
    private float  pressure;

    private  Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+ temperature + "F degrees and "+humidity+"% humidity");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
