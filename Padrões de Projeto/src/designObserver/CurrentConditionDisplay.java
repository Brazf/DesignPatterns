package designObserver;

public class CurrentConditionDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private WeatherData wearthData;
	
	public CurrentConditionDisplay ( WeatherData weatherData) {
		this.wearthData = weatherData;
		wearthData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:" + temperature + "F degress and" + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float preasure) {
		// TODO Auto-generated method stub
		this.humidity = humidity;
		this.temperature = temperature;
		display();
	}
	
}
