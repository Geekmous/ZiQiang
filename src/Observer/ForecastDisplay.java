package Observer;

import java.util.Observable;

public class ForecastDisplay implements java.util.Observer,DisplayElement{
	private Observable observable;
	private float pressure;
	
	ForecastDisplay(Observable observable){
		this.observable	=	observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs,Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData	=	(WeatherData)obs;
			this.pressure			=weatherData.getPressure();
			display();
		}
	}
	
	public void update(float temperature ,float humidity,float pressure){
		this.pressure	=	pressure;
		display();
	}
	public void display(){
		System.out.println("Pressure:"+this.pressure);
	}
}
