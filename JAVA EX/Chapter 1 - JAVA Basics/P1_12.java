public class P1_12 {
	public static void main(String[] args) {
	double Distance_in_miles = 24;
	double Hours_Traveled = 1;
	double Minutes_Traveled = 40;
	double Seconds_Traveled = 35;
	double Time_Traveled = Hours_Traveled + (Minutes_Traveled / 60) + (Seconds_Traveled / 3600);

	double Velocity_in_mph = Distance_in_miles / Time_Traveled;

	double Velocity_in_kph = Velocity_in_mph / 1.6;

	System.out.println("The average speed in kph (kilometers per hour) is : " + Velocity_in_kph);
	}
}