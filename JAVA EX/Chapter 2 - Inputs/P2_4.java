import java.util.Scanner;

public class P2_4 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter a number in pounds : ");
	double Pounds = Inputs.nextDouble();

	double Kilogram = Pounds * 0.454;

	System.out.println(Pounds + " pound(s) is " + Kilogram + " kilogram(s).");
	}
}