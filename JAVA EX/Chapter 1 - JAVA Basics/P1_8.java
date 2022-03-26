import java.lang.Math;

public class P1_8 {
	public static void main(String[] args) {
	double Radius = 5.5;
	
	double Perimeter = 2 * Radius * Math.PI;
	double Area = Math.PI * Math.pow(Radius, 2);
	System.out.println("The perimeter is : " + Perimeter);
	System.out.println("The area is : " + Area);
	}
}