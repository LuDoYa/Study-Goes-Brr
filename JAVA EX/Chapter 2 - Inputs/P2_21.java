import java.util.Scanner;
import java.lang.Math;

public class P2_21 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter investment amount : $");
	double Investment_Amount = Inputs.nextDouble();

	System.out.print("Enter annual interest rate in percentage : ");
	double Annual_Interest_Rate = Inputs.nextDouble();

	System.out.print("Enter number of year(s) : ");
	double Years = Inputs.nextDouble();

	double Monthly_Interest_Rate = Annual_Interest_Rate / 12;

	double Future_Investment_Value = Investment_Amount * Math.pow((1 + Monthly_Interest_Rate), (Years * 12));

	System.out.printf("Accumulated value is %.2f", Future_Investment_Value);
	}
}