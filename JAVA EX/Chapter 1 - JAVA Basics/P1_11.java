import java.lang.Math;

public class P1_11 {
	public static void main(String[] args) {
	int i = 1;
	int Start_Populations = 312032486;
		for (i = i; i <= 5; i++) {
			final double Seconds_per_Year = 365 * 24 * 3600;
			
			double Changes_in_Populations = i * (((Seconds_per_Year)/7) - ((Seconds_per_Year)/13) + ((Seconds_per_Year)/ 45));
			int Remaining_Populations = Start_Populations + (int) Changes_in_Populations;
			System.out.println("By the end of year " + i + ", there are still " + Remaining_Populations + " remains.");
		}
	}
}