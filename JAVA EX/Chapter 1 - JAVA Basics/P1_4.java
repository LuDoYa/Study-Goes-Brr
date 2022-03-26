import java.util.Formatter;
import java.lang.Math;

public class P1_4 {
	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		int[] SetNumbers = {1, 2, 3, 4};
		fmt.format("%15s %15s %15s\n", "a", "a^2", "a^3");

		for (int n : SetNumbers) {
			fmt.format("%15s %13s %15s\n", n, (int) Math.pow(n, 2), (int) Math.pow(n, 3));
		}
		System.out.println(fmt);
	}
}