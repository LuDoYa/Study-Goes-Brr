import java.util.Scanner;

public class P2_6 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000, inclusive : ");
	int Three_Digits = Inputs.nextInt();

	int First_Digit = Three_Digits % 10;

	int Second_Digit = (Three_Digits / 10) % 10;

	int Third_Digit = Three_Digits / 100;

	int Sum_of_Digits = First_Digit + Second_Digit + Third_Digit;

	System.out.println("The sum of the digits is " + Sum_of_Digits);
	}
}
	