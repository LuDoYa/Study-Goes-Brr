import java.util.Scanner;

public class P2_23 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter the driving distance (in miles) : ");
	double Distance = Inputs.nextDouble();

	System.out.print("Enter miles per gallon : ");
	double Miles_per_gallon = Inputs.nextDouble();

	System.out.print("Enter price per gallon : ");
	double Price_per_gallon = Inputs.nextDouble();

	double Cost_of_Driving = (Distance / Miles_per_gallon) * Price_per_gallon;

	System.out.printf("The cost of driving is %.2f", (float) Cost_of_Driving);
	}
}