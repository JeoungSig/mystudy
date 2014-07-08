package headfirst.observer.weather;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		  // 다음 코드에서 weatherData 객체를 Observer객체의 생성자로 전달하므로써
		  // Subject객체가 되는 weatherData에 자신을 등록할수 있도록 한다.
		  // 즉 내부에서는 생성자로부터 전달된 weatherData객체를 이용하여
		  // weatherData.registerObserver(this);의 코드를 이용하여 자신을 등록한다.
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
