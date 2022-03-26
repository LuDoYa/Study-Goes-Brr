import java.util.Scanner;
import java.lang.Math;

public class P3_5 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter today's day (0 up to 6) : ");
	int Today = Inputs.nextInt();
	
	String TheDay = "0", Next_Day = "0";
	switch (Today) {
		case 0 :
			TheDay = "Sunday";
		break;
		case 1 :
			TheDay = "Monday";
		break;
		case 2 :
			TheDay = "Tuesday";
		break;
		case 3 :
			TheDay = "Wednesday";
		break;
		case 4 :
			TheDay = "Thursday";
		break;
		case 5 :
			TheDay = "Friday";
		break;
		case 6 :
			TheDay = "Saturday";
		break;
		default :
			System.out.println("The day is... You kiddin' me?");
			System.exit((int) 0);
		break;
	}

	System.out.print("Enter the number of days elapsed since today : ");
	int Elapsed_Days = Inputs.nextInt();

	int Future_Day = (Today + Elapsed_Days) % 7;
	
	switch (Future_Day) {
		case 0 :
			Next_Day = "Sunday";
		break;
		case 1 :
			Next_Day = "Monday";
		break;
		case 2 :
			Next_Day = "Tuesday";
		break;
		case 3 :
			Next_Day = "Wednesday";
		break;
		case 4 :
			Next_Day = "Thursday";
		break;
		case 5 :
			Next_Day = "Friday";
		break;
		case 6 :
			Next_Day = "Saturday";
		break;
		default :
			System.out.println("The day is... to stop.");
			System.exit((int) 0);
		break;
	}
	System.out.println("Today is " + TheDay + " and the future day is " + Next_Day);
	}
}