package ej5;
/***
 * @author Pablo Navarro
 */
import java.util.Scanner;

public class DegtoFahr {
	public static void main(String[] args) {
		System.out.println("Enter a temperature in Celsius: ");
		Scanner scanCelsius = new Scanner(System.in);
		double Fahrenheit = 0;
		double cels = scanCelsius.nextDouble();
        Fahrenheit =  1.8*cels+32;

		System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
		scanCelsius.close();
	}
}