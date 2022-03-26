import java.util.Scanner;
import java.lang.Math;

public class P2_15 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter x1 and y1 (each number is separated with space) : ");
	double x1 = Inputs.nextDouble();
	double y1 = Inputs.nextDouble();

	System.out.print("Enter x2 and y2 (each number is separated with space) : ");
	double x2 = Inputs.nextDouble();
	double y2 = Inputs.nextDouble();

	double Distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	System.out.println("The distance between the two points is " + Distance);
	}
}