import java.util.Scanner;

public class P2_11 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in)';
	
	System.out.print("Enter the number of year(s) : ");
	double Years = Inputs.nextDouble();

	final double Seconds_per_Year = 365 * 24 * 3600;
			
	double Changes_in_Populations = Years * (((Seconds_per_Year)/7) - ((Seconds_per_Year)/13) + ((Seconds_per_Year)/ 45));
	int Remaining_Populations = Start_Populations + (int) Changes_in_Populations;

	System.out.println("The population in " + Years + " year(s) is " + Remaining_Populations);
	}
}