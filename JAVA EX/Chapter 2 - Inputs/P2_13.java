import java.util.Scanner;
import java.lang.Math;

public class P2_13 {
	public static void main(String[] args){
	Scanner Inputs = new Scanner(System.in);

	final double Interest_Rate = 0.05;
	double Monthly_Interest = 0.05 / 12;

	System.out.print("Enter the monthly saving amount : $");
	double First_Money = Inputs.nextDouble();
	
	double Save_with_Interest = 0;
	for (double i = 1; i <= 6; i++) {
		Save_with_Interest = (First_Money + Save_with_Interest) * (1 + Monthly_Interest);
	}

	System.out.printf("After sixth month, the account value is $%.2f", (float) Save_with_Interest);
	}
}