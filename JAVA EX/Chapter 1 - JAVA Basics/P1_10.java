public class P1_10 {
	public static void main(String[] args) {
	int Distance_in_Kilometers = 14;
	int Minutes_Traveled = 45;
	int Seconds_Traveled = 30;
	int Time_Traveled = Minutes_Traveled * 60 + Seconds_Traveled;

	double Velocity_in_Kps = ((double) Distance_in_Kilometers) / ((double) Time_Traveled);
	
	double Velocity_in_mph = Velocity_in_Kps * 1.6 / 3600;
	System.out.println("Their average mph is : " + Velocity_in_mph);
	}
}