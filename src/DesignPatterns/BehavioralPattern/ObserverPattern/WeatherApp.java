package DesignPatterns.BehavioralPattern.ObserverPattern;

import java.util.*;

interface Observer{
	void update(String weather); 
}

interface Subject{
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

class WeatherStation implements Subject{
	List<Observer> observers = new ArrayList<>();
	private String weather;
	@ Override 
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	@ Override 
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	@ Override 
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(weather);
		}
	}
	
	public void setWeather(String newWeather) {
		this.weather = newWeather;
		notifyObservers();
	}
}

class PhoneDisplay implements Observer{
	private String weather;
	
	@ Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}
	
	private void display() {
		System.out.println("Phone Display: Weather updated - " + weather);
	}
}

class TVDisplay implements Observer{
	private String weather;
	
	@ Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}
	
	private void display() {
		System.out.println("TV Display: Weather updated - " + weather);
	}
}

class WeatherApp{
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        // Register observers
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather changes
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
        weatherStation.setWeather("Cloudy");

        // Remove one observer
        weatherStation.removeObserver(tvDisplay);

        // Notify remaining observer
        weatherStation.setWeather("Windy");
	}
}