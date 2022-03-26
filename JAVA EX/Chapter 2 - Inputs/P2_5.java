import java.util.Scanner;

public class P2_5 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and gratuity rate : ");
	double Subtotal = Inputs.nextDouble();
	double Gratuity_Rate = Inputs.nextDouble();

	double Gratuity = Subtotal * Gratuity_Rate / 100;
	System.out.println("The gratuity is $" + Gratuity + " and total is $" + (Subtotal + Gratuity));
	}
} 