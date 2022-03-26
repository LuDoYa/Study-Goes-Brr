import java.util.Scanner;

public class P2_9 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	System.out.print("Enter v0 (Initial Velocity), v1 (Final Velocity) , and t (Time). (With each data is separated with a space) : ");

	double Initial_Velocity = Inputs.nextDouble();
	double Final_Velocity = Inputs.nextDouble();
	double Time = Inputs.nextDouble();

	double Acceleration = (Final_Velocity - Initial_Velocity) / Time;

	System.out.printf("The average acceleration is : %.4f", (float) Acceleration);
	}
}