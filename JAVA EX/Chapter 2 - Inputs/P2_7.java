import java.util.Scanner;

public class P2_7 {
	public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);
	
	System.out.print("Enter the number of minute(s) : ");
	int Minutes = Inputs.nextInt();

	int Years = Minutes / (365 * 24 * 60);

	int Days = (Minutes % (365 * 24 * 60)) / (1440);

	System.out.println(Minutes + " minutes is approximately " + Years + " years " + Days + " days.");
	}
}