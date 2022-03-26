import java.util.Scanner;
import java.lang.Math;

public class P2_20 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter balance and interest rate (e.g., 3 for 3%) : ");
	double Balance = Inputs.nextDouble();
	double Annual_Interest_Rate = Inputs.nextDouble();
	
	double Interest = (Balance) * (Annual_Interest_Rate / 1200);
	
	System.out.printf("The interest is %.5f", (float) Interest);
	}
}
	

		