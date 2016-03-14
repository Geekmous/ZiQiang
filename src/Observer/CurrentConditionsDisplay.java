package Observer;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer,DisplayElement{
		private float temperature;
		private float humidity;
		private Observable observable;
		
		public CurrentConditionsDisplay(Observable observable){
			this.observable	= observable;
			observable.addObserver(this);
		}
		
		public void update(Observable obs,Object arg){
			if(obs instanceof WeatherData){
				WeatherData weatherData	= (WeatherData)obs;
				this.temperature = weatherData.getTemperature();
				this.humidity =	weatherData.getHumidity();
				display();
			}
		}
		
		public void update(float temperature, float humidity, float pressure){
			this.temperature = temperature;
			this.humidity = humidity;
			display();
		}
		
		public void display(){
			System.out.println("Current conditions:"+this.temperature
					+"F degrees and "+this.humidity+"% humidity");
			
		}
}
