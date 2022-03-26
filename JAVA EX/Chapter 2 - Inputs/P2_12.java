import java.util.Scanner;
import java.lang.Math;

public class P2_12 {
	public static void main(String[] args){
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter speed and acceleration (Each number is separated with space) : ");
	double Speed = Inputs.nextDouble();
	double Acceleration = Inputs.nextDouble();

	double Length = (Math.pow(Speed, 2)) / (2 * Acceleration);

	System.out.printf("The minimum runway for this airplane is : %.3f", (float) Length);
	}
}