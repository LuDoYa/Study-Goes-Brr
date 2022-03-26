import java.util.Scanner;
import java.lang.Math;

public class P2_22 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter an amount (without comma) : ");
	int Amount = Inputs.nextInt();

	int Cents = Amount % 100;

	int Dollars = (Amount - Cents) / 100;

	System.out.println("You have " + Dollars + " dollar(s) and " + Cents + " cent(s).");
	}
}