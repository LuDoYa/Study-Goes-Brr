import java.util.Scanner;

public class P2_10 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter amount of water in kilograms :  ");
	double Water_Mass = Inputs.nextDouble();

	System.out.print("Enter the initial temperature : ");
	double Initial_Temperature = Inputs.nextDouble();

	System.out.print("Enter the final temperature : ");
	double Final_Temperature = Inputs.nextDouble();

	double Q = Water_Mass * (Final_Temperature - Initial_Temperature) * 4184;

	System.out.println("The energy needed is " + Q);
	}
}