import java.util.Scanner;

public class P2_8 {
	public static void main(String[] args) {
	long total_Milliseconds = System.currentTimeMillis();

	long total_Seconds = total_Milliseconds / 1000;

	long current_Seconds = total_Seconds % 60;

	long total_Minutes = total_Seconds / 60;

	long current_Minutes = total_Minutes % 60;

	long total_Hours = total_Minutes / 60;

	Scanner GMT_Inputs = new Scanner(System.in);
	System.out.print("Enter the time zone offset to GMT : ");
	long GMT = GMT_Inputs.nextLong();

	long current_Hours = ((24 + (GMT + total_Hours)) % 24);
	System.out.println("The current time is " + current_Hours + ":" + current_Minutes + ":" + current_Seconds);
	}
}