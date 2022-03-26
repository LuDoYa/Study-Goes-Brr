import java.util.Scanner;
import java.lang.Math;

public class P3_5 {
	public static void main(String[] args) {
	int Random_Number = (int) (1 + (Math.random() * 12));
	
	String Month = "0";
	switch (Random_Number) {
		case 1 :
			Month = "January";
		break;
		case 2 :
			Month = "February";
		break;
		case 3 :
			Month = "March";
		break;
		case 4 :
			Month = "April";
		break;
		case 5 :
			Month = "May";
		break;
		case 6 :
			Month = "June";
		break;
		case 7 :
			Month = "July";
		break;
		case 8 :
			Month = "August";
		break;
		case 9 :
			Month = "September";
		break;
		case 10 :
			Month = "October";
		break;
		case 11 :
			Month = "November";
		break;
		case 12 :
			Month = "December";
		break;
		default :
			System.out.println("THAT'S NOT A MONTH! GROW UP \n-TOMSKA");
	}
	System.out.println("You get the number is " + Random_Number + " and the corresponding month is " + Month);
	}
}