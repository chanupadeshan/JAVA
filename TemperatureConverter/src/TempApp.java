import java.util.Scanner;
public class TempApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureConverter obj1 = new TemperatureConverter();
		TemperatureConverter obj2 = new TemperatureConverter();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius:");
		double celsius = sc.nextDouble();
		
		System.out.println("Enter the temperature in Fahrenheit");
		double Fahrenheit = sc.nextDouble();
		
		
	
		
		
		System.out.println(celsius + " Celsius is equal to "+obj1.temperature+" Fahrenheit");
		System.out.println(Fahrenheit + " Celsius is equal to "+	obj2.temperature+" celsius");
	}

}
