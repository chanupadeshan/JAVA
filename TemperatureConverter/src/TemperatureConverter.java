
public class TemperatureConverter {
	public double temperature;
	
	public TemperatureConverter() {
		// TODO Auto-generated constructor stub
		this.temperature=0;
	}

	public double getTemperature() {
		return this.temperature;
	}
	
	public double celsiusToFahrenheit(double temperature) {
		return (temperature* 9/5) +32;
	}
	
	public double fahrenheitToCelsius(double temperature) {
		return (temperature-32)*5/9;
		
	
	}
}
