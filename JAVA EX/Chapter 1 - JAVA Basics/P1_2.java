public class P1_2 {
	static void nPrintln(String message, int n) {
		int i = 1;
		while (i <= n) {
			System.out.println(message);
			i++;
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Ja- Jawa (nggih)");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		
		System.out.println("\n===");
		System.out.println("As an alternative");
		System.out.println("===\n");

	// alternatively,
		nPrintln("Welcome to Java", 5);
	}
}