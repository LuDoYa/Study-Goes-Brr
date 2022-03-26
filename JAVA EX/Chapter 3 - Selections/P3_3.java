import java.util.Scanner;
import java.lang.Math;

public class P3_3 {
	public static void main(String[] args) {
	System.out.println("Please kindly look at this equation and fill the variables, respectively.\n\n");
	System.out.println("ax + by = e");
	System.out.println("cx + dy = f\n\n");
	Scanner DataInputs = new Scanner(System.in);
	
	System.out.print("Enter numbers for a, b, c, d, e, and f, respectively. (Between numbers is separated with a space) : ");
	double a = DataInputs.nextDouble();
	double b = DataInputs.nextDouble();
	double c = DataInputs.nextDouble();
	double d = DataInputs.nextDouble();
	double e = DataInputs.nextDouble();
	double f = DataInputs.nextDouble();

	if (a * d - b * c == 0) {
		System.out.println("The equation has no solution.");
		System.exit((int) 0);
	}

	double x = (e * d - b * f)/(a * d - b * c);

	double y = (a * f - e * c)/(a * d - b * c);

	System.out.println("\n\n");

	System.out.println("From the linear equation above, we have\n" + 
			"\n x : " + x +
			"\n y : " + y);
	}
}