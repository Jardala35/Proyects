package ej7;
/***
 * @author Pablo Navarro
 */
import java.util.Scanner;

public class AreaCirculo {
// Constant PI is defined at the class level
	static final double PI = 3.14;

	void getArea() {
// Method used to calculate area of a circle
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
/// {Write your code here
		double rad = scanner.nextDouble();
		double area = PI * rad * rad;
/// }
		System.out.print("Area of circle is: " + area);
		scanner.close();
	}

	public static void main(String args[]) {
		AreaCirculo c1 = new AreaCirculo();
		c1.getArea();
	}
}