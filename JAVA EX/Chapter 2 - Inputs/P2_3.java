import java.util.Scanner;

public class P2_3 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter a value for feet : ");
	double Feet = Inputs.nextDouble();

	double Meters = Feet * 0.305;

	System.out.println(Feet + " foot/feet is " + Meters + " meter(s)");
	}
}

	