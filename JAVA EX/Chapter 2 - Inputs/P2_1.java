import java.util.Scanner;

public class P2_1 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter a degree in Celsius : ");
	double Celsius = Inputs.nextDouble();

	double Fahrenheit = ((double) 9 / 5) * Celsius + 32;

	System.out.println("\n\nFrom " + Celsius + " degree Celsius, we have " + Fahrenheit + " degree Fahrenheit.");
	}
}