import java.util.Scanner;

public class P3_2 {
	public static void main(String[] args) {
	int Number1 = (int) (System.currentTimeMillis() % 10);
	int Number2 = (int) (System.currentTimeMillis() / 3 * 7 % 10);
	int Number3 = (int) (System.currentTimeMillis() / 7 % 10);

	Scanner Inputs = new Scanner(System.in);

	System.out.print("What is " + Number1 + " + " + Number2 + " + " + Number3 + "? ");
	int User_Result = Inputs.nextInt();

	System.out.print(Number1 + " + " + Number2 + " + " + Number3 + " = " + User_Result + " is " + (Number1 + Number2 + Number3 == 	User_Result));
	}
}