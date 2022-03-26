import java.util.Scanner;
import java.lang.Math;

public class P2_19 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter three points for a triangle (each number is separated by space) : ");
	double x1 = Inputs.nextDouble();
	double y1 = Inputs.nextDouble();
	double x2 = Inputs.nextDouble();
	double y2 = Inputs.nextDouble();
	double x3 = Inputs.nextDouble();
	double y3 = Inputs.nextDouble();

	double Side1 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
	double Side2 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
	double Side3 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	double s = (Side1 + Side2 + Side3) / 2;

	double Area = Math.sqrt(s * (s - Side1) * (s - Side2) * (s - Side3));

	System.out.printf("The area of the triangle is %.1f", (float) Area);
	}
}