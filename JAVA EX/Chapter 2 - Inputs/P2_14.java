import java.util.Scanner;
import java.lang.Math;

public class P2_14 {
	public static void main(String[] args) {
	Scanner Calc_Inputs = new Scanner(System.in);

	System.out.print("Enter weight in pounds : ");
	double Weight_in_Pounds = Calc_Inputs.nextDouble();

	System.out.print("Enter height in inches : ");
	double Height_in_Inches = Calc_Inputs.nextDouble();

	double Weight_in_Kg = Weight_in_Pounds * 0.45359237;
	double Height_in_Meter = Height_in_Inches * 0.0254;	

	double BMI = (Weight_in_Kg) / (Math.pow(Height_in_Meter, 2));

	System.out.printf("BMI is : %.4f", (float) BMI);
	}
}