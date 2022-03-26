import java.util.Scanner;

public class P3_8 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

	System.out.print("Enter three numbers (separated with space) : ");
	int a = Inputs.nextInt();
	int b = Inputs.nextInt();
	int c = Inputs.nextInt();

	int tmp;
	if (a > c) {
		tmp = a;
		a = c;
		c = tmp;
	}
	else if (b > c) {
		tmp = b;
		b = c;
		c = tmp;
	}
	else if (a > b) {
		tmp = a;
		a = b;
		b = tmp;
	}
	System.out.println("The sorted numbers is " + a + " " + b + " " + c);
	}
}