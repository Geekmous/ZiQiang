package Observer;

import java.util.Observable;

public class StatisticsDisplay implements java.util.Observer,DisplayElement{
		
		private float pressure_min=1000;
		private float pressure_max;
		private float pressure_average;
		
		private	float humidity_min=1000;
		private	float humidity_max;
		private	float humidity_average;
		
		private	float temperature_min=1000;
		private	float temperature_max;
		private	float temperature_average;
		private	int times=0;
		Observable observable;
		
		StatisticsDisplay(Observable observable){
			
			this.observable	=	observable;
			observable.addObserver(this);
		}
		
		public void update(Observable obs,Object arg){
			if(obs instanceof WeatherData){
				WeatherData weatherData	=	(WeatherData)obs;
				this.update(weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());
			}
		}
		
		public void update(float temperature ,float humidity,float pressure){
			this.setTemperature_Average(temperature);
			this.setTemperature_Max(temperature);
			this.setTemperature_Min(temperature);
			this.setHumidity_Average(humidity);
			this.setHumidity_Max(humidity);
			this.setHumidity_Min(humidity);
			this.setPressure_Average(pressure);
			this.setPressure_Max(pressure);
			this.setPressure_Min(pressure);
			
			display();
		}
		
		public void display(){
			System.out.println("\tIndex\t\tMin\tAverage\tMax");
			System.out.println("\tTemperature:\t"+this.temperature_min+"\t"+this.temperature_average+"\t"+this.temperature_max);
			System.out.println("\tHumidity:\t"+this.humidity_min+"\t"+this.humidity_average+"\t"+this.humidity_max);
			System.out.println("\tPressure:\t"+this.pressure_min+"\t"+this.pressure_average+"\t"+this.pressure_max);
		}
		
		private void setTemperature_Min(float temperature){
			if(temperature<this.temperature_min){
				this.temperature_min	=	temperature;
			}
		}
		
		private void setTemperature_Max(float temperature){
			if(temperature>this.temperature_min){
				this.temperature_max	=	temperature;
			}
		}
		
		private void setTemperature_Average(float temperature){
			this.temperature_average	=	(this.temperature_average*times+temperature)/(times+1);
		}
		
		
		private void setHumidity_Min(float humidity){
			if(humidity<this.humidity_min){
				this.humidity_min	=	humidity;
			}
		}
		
		private void setHumidity_Max(float humidity){
			if(humidity>this.temperature_min){
				this.humidity_max	=	humidity;
			}
		}
		
		private void setHumidity_Average(float humidity){
			this.humidity_average	=	(this.humidity_average*times+humidity)/(times+1);
		}
		
		private void setPressure_Min(float pressure){
			if(pressure<this.pressure_min){
				this.pressure_min	=	pressure;
			}
		}
		
		private void setPressure_Max(float pressure	){
			if(pressure>this.pressure_max){
				this.pressure_max	=	pressure;
			}
		}
		
		private void setPressure_Average(float pressure){
			this.pressure_average	=	(this.pressure_average*times+pressure)/(times+1);
		}
}
