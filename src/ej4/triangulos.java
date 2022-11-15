package ej4;

/**
 * 
 * @author Mario Fernandez
 *
 */
public class triangulos {

	public static void main(String[] args) {
		double a;
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of:" + a);
		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of:" + a);
		a = triangleArea(9, 9, 9);
		System.out.println("A triangle with sides 9,9,9 has an area of:" + a);

	}

	private static double triangleArea(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double Area = (s * (s - a) * (s - b) * (s - c));
		Area = Math.pow(Area, 0.5);
		return Area;
	}

}
