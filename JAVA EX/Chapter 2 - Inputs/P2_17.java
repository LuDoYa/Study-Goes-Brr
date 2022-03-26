import java.util.Scanner;
import java.lang.Math;

public class P2_17 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F : ");
	double Outside_Temperature = Inputs.nextInt();

	System.out.print("Enter the wind speed (>= 2) in miles per hour : ");
	double Wind_Speed = Inputs.nextDouble();

	if (Outside_Temperature <= -58) {
		System.exit((int) 0);
	}
	else if (Outside_Temperature >= 41) {
		System.exit((int) 0);
	}
	else if (Wind_Speed < 2) {
		System.exit((int) 0);
	}
	
	double Wind_Chill = 35.74 + 0.6215 * Outside_Temperature - 35.75 * Math.pow(Wind_Speed, 0.16) + 0.4275 * Outside_Temperature * Math.pow(Wind_Speed, 0.16);

	System.out.printf("The wind chill index is %.5f", Wind_Chill);
	}
}