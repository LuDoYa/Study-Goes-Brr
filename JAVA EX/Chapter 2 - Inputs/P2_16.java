import java.util.Scanner;
import java.lang.Math;

public class P2_16 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter the side : ");
	double Side = Inputs.nextDouble();

	double Area = (Math.pow(3, ((double) 3/2))/ 2) * Math.pow(Side, 2);

	System.out.printf("The area of the hexagon is : %.4f", (float) Area);
	}
}