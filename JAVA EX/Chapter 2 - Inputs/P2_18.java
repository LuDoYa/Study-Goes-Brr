import java.util.Formatter;

public class main {
	public static void main(String[] args) {
	Formatter fmt = new Formatter();

	int[] SetNumbers = {1, 2, 3, 4, 5};
	fmt.format("%15s %15s %15s\n", "a", "b", "pow(a, b)");
	
	for (int n : SetNumbers) {
		fmt.format("%15s %15s %10s\n", n, n + 1, (int) Math.pow(n, (n + 1)));
	}
	System.out.println(fmt);
	}
}