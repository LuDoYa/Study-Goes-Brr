import java.util.Scanner;
import java.lang.Math;

public class P2_2 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter the radius and length of a cylinder (Each number is separated with space) : ");
	double Radius = Inputs.nextDouble();
	double Length = Inputs.nextDouble();

	double Area, Volume;

	Area = Math.pow(Radius, 2) * Math.PI;
	Volume = Area * Length;

	System.out.println("The area is : " + Area);
	System.out.println("The volume is : " + Volume);
	}
}