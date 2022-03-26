import java.lang.Math;

public class P1_7 {
	public static void main(String[] args) {
		double Sum = 0;
		for (double i = 1; i <= 7; i++) {
			double i_th_Term = Math.pow(-1, i + 1) * (1/(2 * i - 1));
			Sum += i_th_Term;
			if (i == 6) {
				System.out.println(4 * Sum);
			}
			else if (i == 7) {
				System.out.println(4 * Sum);
			}
		}
		System.out.println("Actually, the value of pi is : " + Math.PI);
	}
}