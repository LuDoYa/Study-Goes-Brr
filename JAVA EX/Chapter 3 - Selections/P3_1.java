import java.util.Scanner;
import java.lang.Math;

public class P3_1 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter your soy sauce (A, B, C) -> with space as separator : ");
	double A = Inputs.nextDouble();
	double B = Inputs.nextDouble();
	double C = Inputs.nextDouble();

	double D = Math.pow(B, 2) - 4 * A * C;

	double x1 = 0, x2 = 0;
	if (D > 0) {
		x1 = (-B + Math.sqrt(D)) / (2 * A);
		x2 = (-B - Math.sqrt(D)) / (2 * A);
		System.out.printf("The equation has two real roots %.5f and %.5f", x1, x2);
	}
	else if (D == 0) {
		x1 = (-B) / (2 * A);
		System.out.println("The equation has one root " + x1);
	}
	else {
		System.out.println("The equation has no real roots.");
	}
	}
}